package org.ovirt.engine.api.restapi.resource;

import static org.easymock.EasyMock.expect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.WebApplicationException;

import org.junit.Test;
import org.ovirt.engine.api.model.Tag;
import org.ovirt.engine.core.common.action.AttachEntityToTagParameters;
import org.ovirt.engine.core.common.action.VdcActionType;
import org.ovirt.engine.core.common.businessentities.Tags;
import org.ovirt.engine.core.common.queries.GetTagsByUserGroupIdParameters;
import org.ovirt.engine.core.common.queries.VdcQueryType;
import org.ovirt.engine.core.compat.Guid;

public class BackendGroupTagResourceTest extends AbstractBackendSubResourceTest<Tag, Tags, BackendGroupTagResource> {
    private static final Guid GROUP_ID = GUIDS[0];
    private static final Guid TAG_ID = GUIDS[1];

    public BackendGroupTagResourceTest() {
        super(new BackendGroupTagResource(GROUP_ID, TAG_ID.toString()));
    }

    @Test
    public void testRemove() throws Exception {
        setUpGetTagExpectations(true);
        setUriInfo(
            setUpActionExpectations(
                VdcActionType.DetachUserGroupFromTag,
                AttachEntityToTagParameters.class,
                new String[] { "TagId", "EntitiesId" },
                new Object[] { TAG_ID, asList(GROUP_ID) },
                true,
                true
            )
        );
        verifyRemove(resource.remove());
    }

    @Test
    public void testRemoveCantDo() throws Exception {
        doTestBadRemove(false, true, CANT_DO);
    }

    @Test
    public void testRemoveFailed() throws Exception {
        doTestBadRemove(true, false, FAILURE);
    }

    private void doTestBadRemove(boolean valid, boolean success, String detail) throws Exception {
        setUpGetTagExpectations(true);
        setUriInfo(
            setUpActionExpectations(
                VdcActionType.DetachUserGroupFromTag,
                AttachEntityToTagParameters.class,
                new String[] { "TagId", "EntitiesId" },
                new Object[] { TAG_ID, asList(GROUP_ID) },
                valid,
                success));
        try {
            resource.remove();
            fail("expected WebApplicationException");
        }
        catch (WebApplicationException wae) {
            verifyFault(wae, detail);
        }
    }

    @Test
    public void testRemoveNonExistant() throws Exception{
        setUpGetTagExpectations(false);
        control.replay();
        try {
            resource.remove();
            fail("expected WebApplicationException");
        }
        catch (WebApplicationException wae) {
            assertNotNull(wae.getResponse());
            assertEquals(404, wae.getResponse().getStatus());
        }
    }

    private void setUpGetTagExpectations(boolean succeed) throws Exception {
        setUpGetEntityExpectations(
            VdcQueryType.GetTagsByUserGroupId,
            GetTagsByUserGroupIdParameters.class,
            new String[] { "GroupId" },
            new Object[] { GROUP_ID.toString() },
            succeed? setUpTagsExpectations(): Collections.emptyList()
        );
    }

    private List<Tags> setUpTagsExpectations() {
        List<Tags> tags = new ArrayList<>();
        for (int i = 0; i < GUIDS.length; i++) {
            Tags tag = setUpTagExpectations(GUIDS[i]);
            tags.add(tag);
        }
        return tags;
    }

    private Tags setUpTagExpectations(Guid tagId) {
        Tags mock = control.createMock(Tags.class);
        expect(mock.getTagId()).andReturn(tagId).anyTimes();
        expect(mock.getParentId()).andReturn(GROUP_ID).anyTimes();
        return mock;
    }
}
