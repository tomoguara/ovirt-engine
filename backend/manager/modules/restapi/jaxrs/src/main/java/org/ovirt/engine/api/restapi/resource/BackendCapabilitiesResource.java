package org.ovirt.engine.api.restapi.resource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.ovirt.engine.api.model.Agent;
import org.ovirt.engine.api.model.Agents;
import org.ovirt.engine.api.model.ArchitectureCapabilities;
import org.ovirt.engine.api.model.ArchitectureCapability;
import org.ovirt.engine.api.model.AuthenticationMethod;
import org.ovirt.engine.api.model.BootDevice;
import org.ovirt.engine.api.model.BootDevices;
import org.ovirt.engine.api.model.BootProtocol;
import org.ovirt.engine.api.model.BootProtocols;
import org.ovirt.engine.api.model.Capabilities;
import org.ovirt.engine.api.model.ConfigurationType;
import org.ovirt.engine.api.model.ConfigurationTypes;
import org.ovirt.engine.api.model.ContentTypes;
import org.ovirt.engine.api.model.Cpu;
import org.ovirt.engine.api.model.CpuMode;
import org.ovirt.engine.api.model.CpuModes;
import org.ovirt.engine.api.model.Cpus;
import org.ovirt.engine.api.model.CreationStates;
import org.ovirt.engine.api.model.CreationStatus;
import org.ovirt.engine.api.model.CustomProperties;
import org.ovirt.engine.api.model.CustomProperty;
import org.ovirt.engine.api.model.DataCenterStates;
import org.ovirt.engine.api.model.DataCenterStatus;
import org.ovirt.engine.api.model.DiskFormat;
import org.ovirt.engine.api.model.DiskFormats;
import org.ovirt.engine.api.model.DiskInterface;
import org.ovirt.engine.api.model.DiskInterfaces;
import org.ovirt.engine.api.model.DiskStates;
import org.ovirt.engine.api.model.DiskStatus;
import org.ovirt.engine.api.model.DiskStorageType;
import org.ovirt.engine.api.model.DiskStorageTypes;
import org.ovirt.engine.api.model.DisplayDisconnectActions;
import org.ovirt.engine.api.model.DisplayType;
import org.ovirt.engine.api.model.DisplayTypes;
import org.ovirt.engine.api.model.EntityExternalStatus;
import org.ovirt.engine.api.model.ExternalStatuses;
import org.ovirt.engine.api.model.FenceType;
import org.ovirt.engine.api.model.FenceTypes;
import org.ovirt.engine.api.model.GlusterState;
import org.ovirt.engine.api.model.GlusterStates;
import org.ovirt.engine.api.model.GlusterVolumeType;
import org.ovirt.engine.api.model.GlusterVolumeTypes;
import org.ovirt.engine.api.model.GraphicsType;
import org.ovirt.engine.api.model.GraphicsTypes;
import org.ovirt.engine.api.model.HookContentType;
import org.ovirt.engine.api.model.HookStage;
import org.ovirt.engine.api.model.HookStates;
import org.ovirt.engine.api.model.HookStatus;
import org.ovirt.engine.api.model.HostNicStates;
import org.ovirt.engine.api.model.HostNonOperationalDetails;
import org.ovirt.engine.api.model.HostProtocol;
import org.ovirt.engine.api.model.HostProtocols;
import org.ovirt.engine.api.model.HostStates;
import org.ovirt.engine.api.model.HostStatus;
import org.ovirt.engine.api.model.InheritableBoolean;
import org.ovirt.engine.api.model.InheritableBooleans;
import org.ovirt.engine.api.model.IpVersion;
import org.ovirt.engine.api.model.IpVersions;
import org.ovirt.engine.api.model.KdumpStates;
import org.ovirt.engine.api.model.KdumpStatus;
import org.ovirt.engine.api.model.MessageBrokerType;
import org.ovirt.engine.api.model.MessageBrokerTypes;
import org.ovirt.engine.api.model.MigrateOnError;
import org.ovirt.engine.api.model.NetworkPluginType;
import org.ovirt.engine.api.model.NetworkPluginTypes;
import org.ovirt.engine.api.model.NetworkStates;
import org.ovirt.engine.api.model.NetworkStatus;
import org.ovirt.engine.api.model.NfsVersion;
import org.ovirt.engine.api.model.NfsVersions;
import org.ovirt.engine.api.model.NicInterface;
import org.ovirt.engine.api.model.NicInterfaces;
import org.ovirt.engine.api.model.NicStatus;
import org.ovirt.engine.api.model.OsTypeUtils;
import org.ovirt.engine.api.model.OsTypes;
import org.ovirt.engine.api.model.PayloadEncoding;
import org.ovirt.engine.api.model.PayloadEncodings;
import org.ovirt.engine.api.model.Permit;
import org.ovirt.engine.api.model.PermitType;
import org.ovirt.engine.api.model.Permits;
import org.ovirt.engine.api.model.PmProxyType;
import org.ovirt.engine.api.model.PmProxyTypes;
import org.ovirt.engine.api.model.PolicyUnitType;
import org.ovirt.engine.api.model.PowerManagementStates;
import org.ovirt.engine.api.model.PowerManagementStatus;
import org.ovirt.engine.api.model.QosType;
import org.ovirt.engine.api.model.QosTypes;
import org.ovirt.engine.api.model.QuotaModeType;
import org.ovirt.engine.api.model.QuotaModeTypes;
import org.ovirt.engine.api.model.ReportedDeviceType;
import org.ovirt.engine.api.model.ReportedDeviceTypes;
import org.ovirt.engine.api.model.RngSource;
import org.ovirt.engine.api.model.RngSources;
import org.ovirt.engine.api.model.SchedulingPolicyUnitTypes;
import org.ovirt.engine.api.model.ScsiGenericIO;
import org.ovirt.engine.api.model.ScsiGenericIoOptions;
import org.ovirt.engine.api.model.SeLinuxMode;
import org.ovirt.engine.api.model.SeLinuxModes;
import org.ovirt.engine.api.model.SerialNumberPolicies;
import org.ovirt.engine.api.model.SerialNumberPolicy;
import org.ovirt.engine.api.model.SnapshotStatus;
import org.ovirt.engine.api.model.SnapshotStatuses;
import org.ovirt.engine.api.model.SpmStates;
import org.ovirt.engine.api.model.SpmStatus;
import org.ovirt.engine.api.model.Stages;
import org.ovirt.engine.api.model.StepEnum;
import org.ovirt.engine.api.model.StepTypes;
import org.ovirt.engine.api.model.StorageDomainStates;
import org.ovirt.engine.api.model.StorageDomainStatus;
import org.ovirt.engine.api.model.StorageDomainType;
import org.ovirt.engine.api.model.StorageDomainTypes;
import org.ovirt.engine.api.model.StorageFormat;
import org.ovirt.engine.api.model.StorageFormats;
import org.ovirt.engine.api.model.StorageType;
import org.ovirt.engine.api.model.StorageTypes;
import org.ovirt.engine.api.model.TemplateStates;
import org.ovirt.engine.api.model.TemplateStatus;
import org.ovirt.engine.api.model.TransportType;
import org.ovirt.engine.api.model.TransportTypes;
import org.ovirt.engine.api.model.Usages;
import org.ovirt.engine.api.model.Version;
import org.ovirt.engine.api.model.VersionCaps;
import org.ovirt.engine.api.model.VmAffinities;
import org.ovirt.engine.api.model.VmAffinity;
import org.ovirt.engine.api.model.VmDeviceType;
import org.ovirt.engine.api.model.VmDeviceTypes;
import org.ovirt.engine.api.model.VmPauseDetails;
import org.ovirt.engine.api.model.VmPoolType;
import org.ovirt.engine.api.model.VmPoolTypes;
import org.ovirt.engine.api.model.VmStates;
import org.ovirt.engine.api.model.VmStatus;
import org.ovirt.engine.api.model.VmType;
import org.ovirt.engine.api.model.VmTypes;
import org.ovirt.engine.api.model.WatchdogAction;
import org.ovirt.engine.api.model.WatchdogActions;
import org.ovirt.engine.api.model.WatchdogModel;
import org.ovirt.engine.api.model.WatchdogModels;
import org.ovirt.engine.api.resource.CapabilitiesResource;
import org.ovirt.engine.api.resource.CapabiliyResource;
import org.ovirt.engine.api.restapi.resource.utils.FeaturesHelper;
import org.ovirt.engine.api.restapi.types.CPUMapper;
import org.ovirt.engine.api.restapi.types.NetworkUsage;
import org.ovirt.engine.api.restapi.util.FenceOptionsParser;
import org.ovirt.engine.api.restapi.util.LinkHelper;
import org.ovirt.engine.api.restapi.util.VersionHelper;
import org.ovirt.engine.api.restapi.utils.CustomPropertiesParser;
import org.ovirt.engine.api.restapi.utils.VersionUtils;
import org.ovirt.engine.core.common.FeatureSupported;
import org.ovirt.engine.core.common.businessentities.ArchitectureType;
import org.ovirt.engine.core.common.businessentities.ConsoleDisconnectAction;
import org.ovirt.engine.core.common.businessentities.NonOperationalReason;
import org.ovirt.engine.core.common.businessentities.ServerCpu;
import org.ovirt.engine.core.common.businessentities.VmPauseStatus;
import org.ovirt.engine.core.common.queries.ConfigurationValues;
import org.ovirt.engine.core.common.queries.GetAllServerCpuListParameters;
import org.ovirt.engine.core.common.queries.VdcQueryType;
import org.ovirt.engine.core.compat.Guid;

public class BackendCapabilitiesResource extends BackendResource implements CapabilitiesResource {

    private final FeaturesHelper featuresHelper = new FeaturesHelper();

    public static final Version VERSION_3_5 = new Version() {
        {
            major = 3;
            minor = 5;
        }
    };
    public static final Version VERSION_3_6 = new Version() {
        {
            major = 3;
            minor = 6;
        }
    };
    public static final Version VERSION_4_0 = new Version() {
        {
            major = 4;
            minor = 0;
        }
    };
    private static Version currentVersion = null;

    @Override
    public Capabilities list() {
        Capabilities caps = new Capabilities();
        for (Version v : getSupportedClusterLevels()) {
            caps.getVersions().add(generateVersionCaps(v));
        }
        return caps;
    }

    public VersionCaps generateVersionCaps(Version v) {
        VersionCaps version = new VersionCaps();

        version.setMajor(v.getMajor());
        version.setMinor(v.getMinor());
        version.setId(generateId(v));

        // Not exposing CPU list and power managers on filtered queries
        if (!isFiltered()) {
            version.setCpus(new Cpus());
            for (ServerCpu sc : getServerCpuList(v)) {
                Cpu cpu = new Cpu();
                cpu.setType(sc.getCpuName());
                cpu.setLevel(sc.getLevel());
                cpu.setArchitecture(CPUMapper.map(sc.getArchitecture(), null));
                version.getCpus().getCpus().add(cpu);
            }
            addPowerManagementAgents(version, getPowerManagementAgents(v));
        }

        addVmTypes(version, VmType.values());
        addAuthenticationMethods(version, AuthenticationMethod.values());
        addStorageTypes(version, getStorageTypes(v));
        addStorageDomainTypes(version, StorageDomainType.values());
        addFenceTypes(version, FenceType.values());
        addBootDevices(version, BootDevice.values());
        addDisplayTypes(version, DisplayType.values());
        addNicInterfaces(version, NicInterface.values());
        addDiskFormats(version, DiskFormat.values());
        addGraphicsTypes(version, GraphicsType.values());
        addDiskStorageTypes(version, DiskStorageType.values());
        addDiskInterfaces(version, DiskInterface.values());
        addCustomProperties(version, getVmHooksEnvs(v));
        addVmAffinities(version, VmAffinity.values());
        addVmDeviceType(version, VmDeviceType.values());
        addnetworkBootProtocols(version, BootProtocol.values());
        addMigrateOnErrorOptions(version, MigrateOnError.values());
        addStorageFormatOptions(version, StorageFormat.values());
        addOsTypes(version);
        addNfsVersions(version, NfsVersion.values());
        addKdumpStates(version, KdumpStatus.values());
        addSupportedQosTypes(version);

        addGlusterTypesAndStates(version);

        // Add States. User can't update States, but he still needs to know which exist.
        addCreationStates(version, CreationStatus.values());
        addStorageDomaintStates(version, StorageDomainStatus.values());
        addPowerManagementStateses(version, PowerManagementStatus.values());
        addHostStates(version, HostStatus.values());
        addExternalStates(version, EntityExternalStatus.values());
        addHostProtocols(version, HostProtocol.values());
        addHostNonOperationalDetails(version, NonOperationalReason.values());
        addNetworkStates(version, NetworkStatus.values());
        addTemplateStates(version, TemplateStatus.values());
        addVmStates(version, VmStatus.values());
        addVmPauseDetails(version, VmPauseStatus.values());
        addDiskStates(version, DiskStatus.values());
        addHostNICStates(version, NicStatus.values());
        addDataCenterStates(version, DataCenterStatus.values());
        addPermits(version, PermitType.values());
        addNetworkUsages(version, NetworkUsage.values());
        addPmProxyTypes(version, PmProxyType.values());
        addReportedDeviceTypes(version, ReportedDeviceType.values());
        addIpVersions(version, IpVersion.values());
        addCpuModes(version, CpuMode.values());
        addScsiGenericIoOptions(version, ScsiGenericIO.values());
        addWatchdogActions(version, WatchdogAction.values());
        addWatchdogModels(version, WatchdogModel.values());
        addConfigurationTypes(version, ConfigurationType.values());
        addSnapshotStatuses(version, SnapshotStatus.values());
        addPayloadEncodings(version, PayloadEncoding.values());
        addArchitectureCapabilities(version);
        addSerialNumberPolicies(version, SerialNumberPolicy.values());
        addSELinuxModes(version, SeLinuxMode.values());
        addRngSources(version, RngSource.values());
        addPolicyUnitTypes(version, PolicyUnitType.values());
        addSpmStates(version, SpmStatus.values());
        addVmPoolTypes(version, VmPoolType.values());
        addNetworkPluginTypes(version, NetworkPluginType.values());
        addMessageBrokerTypes(version, MessageBrokerType.values());
        addConsoleDisconnectActions(version, ConsoleDisconnectAction.values());

        // External tasks types
        addStepEnumTypes(version, StepEnum.values());
        addInheritableBooleans(version, InheritableBoolean.values());
        addQuotaModeTypes(version);

        version.setFeatures(featuresHelper.getFeatures(v));

        Version currentVersion = getCurrentVersion();
        version.setCurrent(currentVersion != null && VersionHelper.equals(version, currentVersion));

        LinkHelper.<VersionCaps> addLinks(version);

        return version;
    }

    private void addConsoleDisconnectActions(VersionCaps version, ConsoleDisconnectAction[] values) {
        if (VersionUtils.greaterOrEqual(version, VERSION_3_6)) {
            version.setDisplayDisconnectActions(new DisplayDisconnectActions());
            for (ConsoleDisconnectAction value : values) {
                version.getDisplayDisconnectActions().getDisplayDisconnectActions().add(value.toString());
            }
        }
    }

    private void addArchitectureCapabilities(VersionCaps version) {
        org.ovirt.engine.core.compat.Version backendVersion =
                new org.ovirt.engine.core.compat.Version(version.getMajor(), version.getMinor());

        version.setArchitectureCapabilities(new ArchitectureCapabilities());

        ArchitectureCapability migrationFeature = new ArchitectureCapability();

        migrationFeature.setName("migration");

        for (ArchitectureType arch : ArchitectureType.values()) {
            if (FeatureSupported.isMigrationSupported(arch, backendVersion)) {
                migrationFeature.getArchitectures().add(arch.name());
            }
        }

        version.getArchitectureCapabilities().getCapabilities().add(migrationFeature);

        ArchitectureCapability memorySnapshotFeature = new ArchitectureCapability();

        memorySnapshotFeature.setName("memory snapshot");

        for (ArchitectureType arch : ArchitectureType.values()) {
            if (FeatureSupported.isMemorySnapshotSupportedByArchitecture(arch, backendVersion)) {
                memorySnapshotFeature.getArchitectures().add(arch.name());
            }
        }

        version.getArchitectureCapabilities().getCapabilities().add(memorySnapshotFeature);

        ArchitectureCapability suspendFeature = new ArchitectureCapability();

        suspendFeature.setName("suspend");

        for (ArchitectureType arch : ArchitectureType.values()) {
            if (FeatureSupported.isSuspendSupportedByArchitecture(arch, backendVersion)) {
                suspendFeature.getArchitectures().add(arch.name());
            }
        }

        version.getArchitectureCapabilities().getCapabilities().add(suspendFeature);
    }

    private void addSnapshotStatuses(VersionCaps version, SnapshotStatus[] values) {
        version.setSnapshotStatuses(new SnapshotStatuses());
        for (SnapshotStatus mode : values) {
            version.getSnapshotStatuses().getSnapshotStatuses().add(mode.value());
        }
    }

    private void addPayloadEncodings(VersionCaps version, PayloadEncoding[] values) {
        version.setPayloadEncodings(new PayloadEncodings());
        for (PayloadEncoding mode : values) {
            version.getPayloadEncodings().getPayloadEncodings().add(mode.value());
        }
    }

    private void addCpuModes(VersionCaps version, CpuMode[] values) {
        version.setCpuModes(new CpuModes());
        for (CpuMode mode : values) {
            version.getCpuModes().getCpuModes().add(mode.value());
        }
    }

    private void addScsiGenericIoOptions(VersionCaps version, ScsiGenericIO[] values) {
        version.setSgioOptions(new ScsiGenericIoOptions());
        for (ScsiGenericIO mode : values) {
            version.getSgioOptions().getScsiGenericIoOptions().add(mode.value());
        }
    }

    private void addWatchdogModels(VersionCaps version, WatchdogModel[] values) {
        version.setWatchdogModels(new WatchdogModels());
        for (WatchdogModel watchdogModel : values) {
            version.getWatchdogModels().getWatchdogModels().add(watchdogModel.value());
        }
    }

    private void addWatchdogActions(VersionCaps version, WatchdogAction[] values) {
        version.setWatchdogActions(new WatchdogActions());
        for (WatchdogAction watchdogAction : values) {
            version.getWatchdogActions().getWatchdogActions().add(watchdogAction.value());
        }
    }

    private void addReportedDeviceTypes(VersionCaps version, ReportedDeviceType[] values) {
        version.setReportedDeviceTypes(new ReportedDeviceTypes());
        for (ReportedDeviceType reportedDeviceType : values) {
            version.getReportedDeviceTypes().getReportedDeviceTypes().add(reportedDeviceType.value());
        }
    }

    private void addIpVersions(VersionCaps version, IpVersion[] values) {
        version.setIpVersions(new IpVersions());
        for (IpVersion ipVersion : values) {
            version.getIpVersions().getIpVersions().add(ipVersion.value());
        }
    }

    public String generateId(Version v) {
        Guid guid = asGuid((v.getMajor() + "." + v.getMinor()).getBytes(), true);
        return guid.toString();
    }

    private void addNetworkUsages(VersionCaps version, NetworkUsage[] values) {
        version.setUsages(new Usages());
        for (NetworkUsage usage : values) {
            version.getUsages().getUsages().add(usage.value());
        }
    }

    private void addPermits(VersionCaps version, PermitType[] values) {
        version.setPermits(new Permits());
        for (PermitType permit : values) {
            version.getPermits().getPermits().add(map(permit));
        }
    }

    private void addGlusterTypesAndStates(VersionCaps version) {
        addGlusterVolumeTypes(version, GlusterVolumeType.values());
        addTransportTypes(version, TransportType.values());
        addGlusterVolumeStates(version, GlusterState.values());
        addGlusterBrickStates(version, GlusterState.values());
        addGlusterHookContentTypes(version, HookContentType.values());
        addStages(version, HookStage.values());
        addGlusterHookStates(version, HookStatus.values());
    }

    private Version getCurrentVersion() {
        if (currentVersion == null) {
            String currentVersionString = getConfigurationValueDefault(ConfigurationValues.VdcVersion);
            if (currentVersionString != null) {
                currentVersion = VersionHelper.parseVersion(currentVersionString);
            }
        }
        return currentVersion;
    }

    private void addOsTypes(VersionCaps version) {
        version.setOsTypes(new OsTypes());
        version.getOsTypes().getOsTypes().addAll(OsTypeUtils.getAllValues());
    }

    private void addNfsVersions(VersionCaps version, NfsVersion[] nfsVersions) {
        version.setNfsVersions(new NfsVersions());
        for (NfsVersion nfsVersion : nfsVersions) {
            version.getNfsVersions().getNfsVersions().add(nfsVersion.value());
        }
    }

    private void addnetworkBootProtocols(VersionCaps version, BootProtocol[] values) {
        version.setBootProtocols(new BootProtocols());
        for (BootProtocol bootProtocol : values) {
            version.getBootProtocols().getBootProtocols().add(bootProtocol.value());
        }
    }

    private void addVmAffinities(VersionCaps version, VmAffinity[] values) {
        version.setVmAffinities(new VmAffinities());
        for (VmAffinity affinity : values) {
            version.getVmAffinities().getVmAffinities().add(affinity.value());
        }
    }

    private void addVmDeviceType(VersionCaps version, VmDeviceType[] values) {
        version.setVmDeviceTypes(new VmDeviceTypes());
        for (VmDeviceType type : values) {
            version.getVmDeviceTypes().getVmDeviceTypes().add(type.value());
        }
    }

    private void addPowerManagementAgents(VersionCaps version, List<Agent> agents) {
        version.setPowerManagement(new Agents());
        version.getPowerManagement().getAgents().addAll(agents);
    }

    private void addVmTypes(VersionCaps version, VmType... types) {
        version.setVmTypes(new VmTypes());
        for (VmType type : types) {
            version.getVmTypes().getVmTypes().add(type.value());
        }
    }

    private void addStorageTypes(VersionCaps version, List<StorageType> types) {
        version.setStorageTypes(new StorageTypes());
        for (StorageType type : types) {
            version.getStorageTypes().getStorageTypes().add(type.value());
        }
    }

    private void addConfigurationTypes(VersionCaps version, ConfigurationType[] types) {
        version.setConfigurationTypes(new ConfigurationTypes());
        for (ConfigurationType type : types) {
            version.getConfigurationTypes().getConfigurationTypes().add(type.value());
        }
    }

    private void addStorageDomainTypes(VersionCaps version, StorageDomainType... types) {
        version.setStorageDomainTypes(new StorageDomainTypes());
        for (StorageDomainType type : types) {
            version.getStorageDomainTypes().getStorageDomainTypes().add(type.value());
        }
    }

    private void addFenceTypes(VersionCaps version, FenceType... types) {
        version.setFenceTypes(new FenceTypes());
        for (FenceType type : types) {
            version.getFenceTypes().getFenceTypes().add(type.value());
        }
    }

    private void addBootDevices(VersionCaps version, BootDevice... devs) {
        version.setBootDevices(new BootDevices());
        for (BootDevice dev : devs) {
            version.getBootDevices().getBootDevices().add(dev.value());
        }
    }

    private void addDisplayTypes(VersionCaps version, DisplayType... types) {
        version.setDisplayTypes(new DisplayTypes());
        for (DisplayType type : types) {
            version.getDisplayTypes().getDisplayTypes().add(type.value());
        }
    }

    private void addNicInterfaces(VersionCaps version, NicInterface... types) {
        version.setNicInterfaces(new NicInterfaces());
        for (NicInterface type : types) {
            version.getNicInterfaces().getNicInterfaces().add(type.value());
        }
    }

    private void addDiskFormats(VersionCaps version, DiskFormat... types) {
        version.setDiskFormats(new DiskFormats());
        for (DiskFormat type : types) {
            version.getDiskFormats().getDiskFormats().add(type.value());
        }
    }

    private void addGraphicsTypes(VersionCaps version, GraphicsType... types) {
        version.setGraphicsTypes(new GraphicsTypes());
        for (GraphicsType type : types) {
            version.getGraphicsTypes().getGraphicsTypes().add(type.value());
        }
    }

    private void addDiskStorageTypes(VersionCaps version, DiskStorageType... types) {
        version.setDiskStorageTypes(new DiskStorageTypes());
        for (DiskStorageType type : types) {
            version.getDiskStorageTypes().getDiskStorageTypes().add(type.value());
        }
    }

    private void addDiskInterfaces(VersionCaps version, DiskInterface... interfaces) {
        version.setDiskInterfaces(new DiskInterfaces());
        for (DiskInterface iface : interfaces) {
            version.getDiskInterfaces().getDiskInterfaces().add(iface.value());
        }
    }

    private void addCustomProperties(VersionCaps version, List<CustomProperty> envs) {
        version.setCustomProperties(new CustomProperties());
        version.getCustomProperties().getCustomProperties().addAll(envs);
    }

    private List<Agent> getPowerManagementAgents(Version version) {
        String fenceMapping = getConfigurationValue(ConfigurationValues.VdsFenceOptionMapping, version);
        String fenceTypes = getConfigurationValueDefault(ConfigurationValues.VdsFenceOptionTypes);
        if (fenceMapping != null && fenceTypes != null) {
            return FenceOptionsParser.parse(fenceMapping, fenceTypes);
        }
        return Collections.emptyList();
    }

    private List<StorageType> getStorageTypes(Version version) {
        List<StorageType> ret = new ArrayList<>();
        ret.add(StorageType.ISCSI);
        ret.add(StorageType.FCP);
        ret.add(StorageType.NFS);
        ret.add(StorageType.LOCALFS);
        ret.add(StorageType.POSIXFS);
        ret.add(StorageType.GLUSTERFS);

        return ret;
    }

    private List<CustomProperty> getVmHooksEnvs(Version version) {
        List<CustomProperty> ret = new ArrayList<>();
        String predefinedProperties = getConfigurationValue(ConfigurationValues.PredefinedVMProperties, version);
        if (predefinedProperties != null) {
            ret.addAll(CustomPropertiesParser.parse(predefinedProperties, true));
        }
        String userDefinedProperties = getConfigurationValue(ConfigurationValues.UserDefinedVMProperties, version);
        if (userDefinedProperties != null) {
            ret.addAll(CustomPropertiesParser.parse(userDefinedProperties, true));
        }
        return ret;
    }

    private List<ServerCpu> getServerCpuList(Version version) {
        return getEntity(List.class, VdcQueryType.GetAllServerCpuList,
                new GetAllServerCpuListParameters(new org.ovirt.engine.core.compat.Version(asString(version))),
                "List<ServerCpu>");
    }

    public List<Version> getSupportedClusterLevels() {
        List<Version> versions = new ArrayList<>();
        Set<org.ovirt.engine.core.compat.Version> supportedClusterLevels = getConfigurationValueDefault(
            ConfigurationValues.SupportedClusterLevels
        );
        if (supportedClusterLevels != null) {
            for (org.ovirt.engine.core.compat.Version supportedClusterLevel : supportedClusterLevels) {
                Version version = new Version();
                version.setMajor(supportedClusterLevel.getMajor());
                version.setMinor(supportedClusterLevel.getMinor());
                versions.add(version);
            }
        }
        return versions;
    }

    private Permit map(PermitType entity) {
        return mappingLocator.getMapper(PermitType.class, Permit.class).map(entity, null);
    }

    private void addMigrateOnErrorOptions(VersionCaps version, MigrateOnError[] values) {
        version.setErrorHandling(new org.ovirt.engine.api.model.ErrorHandlingOptions());
        for (MigrateOnError option : values) {
            version.getErrorHandling().getErrorHandling().add(option.value());
        }
    }

    private void addStorageFormatOptions(VersionCaps version, StorageFormat... formats) {
        version.setStorageFormats(new StorageFormats());
        for (StorageFormat format : formats) {
            version.getStorageFormats().getStorageFormats().add(format.value());
        }
    }

    private void addCreationStates(VersionCaps version, CreationStatus[] values) {
        version.setCreationStates(new CreationStates());
        for (CreationStatus status : values) {
            version.getCreationStates().getCreationStates().add(status.value());
        }
    }

    private void addDataCenterStates(VersionCaps version, DataCenterStatus[] values) {
        version.setDataCenterStates(new DataCenterStates());
        for (DataCenterStatus status : values) {
            version.getDataCenterStates().getDataCenterStates().add(status.value());
        }
    }

    private void addHostNICStates(VersionCaps version, NicStatus[] values) {
        version.setHostNicStates(new HostNicStates());
        for (NicStatus status : values) {
            version.getHostNicStates().getHostNicStates().add(status.value());
        }
    }

    private void addDiskStates(VersionCaps version, DiskStatus[] values) {
        version.setDiskStates(new DiskStates());
        for (DiskStatus status : values) {
            version.getDiskStates().getDiskStates().add(status.value());
        }
    }

    private void addVmStates(VersionCaps version, VmStatus[] values) {
        version.setVmStates(new VmStates());
        for (VmStatus status : values) {
            version.getVmStates().getVmStates().add(status.value());
        }
    }

    private void addVmPauseDetails(VersionCaps version, VmPauseStatus[] values) {
        version.setVmPauseDetails(new VmPauseDetails());
        for (VmPauseStatus detail : values) {
            version.getVmPauseDetails().getVmPauseDetails().add(detail.name().toLowerCase());
        }
    }

    private void addTemplateStates(VersionCaps version, TemplateStatus[] values) {
        version.setTemplateStates(new TemplateStates());
        for (TemplateStatus status : values) {
            version.getTemplateStates().getTemplateStates().add(status.value());
        }
    }

    private void addNetworkStates(VersionCaps version, NetworkStatus[] values) {
        version.setNetworkStates(new NetworkStates());
        for (NetworkStatus status : values) {
            version.getNetworkStates().getNetworkStates().add(status.value());
        }
    }

    private void addHostStates(VersionCaps version, HostStatus[] values) {
        version.setHostStates(new HostStates());
        for (HostStatus status : values) {
            version.getHostStates().getHostStates().add(status.value());
        }
    }

    private void addExternalStates(VersionCaps version, EntityExternalStatus[] values) {
        version.setExternalStatuses(new ExternalStatuses());
        for (EntityExternalStatus status : values) {
            version.getExternalStatuses().getExternalStatus().add(status.value());
        }
    }

    private void addHostProtocols(VersionCaps version, HostProtocol[] values) {
        version.setHostProtocols(new HostProtocols());
        for (HostProtocol protocol : values) {
            version.getHostProtocols().getHostProtocols().add(protocol.value());
        }
    }

    private void addHostNonOperationalDetails(VersionCaps version, NonOperationalReason[] values) {
        version.setHostNonOperationalDetails(new HostNonOperationalDetails());
        for (NonOperationalReason reason : values) {
            version.getHostNonOperationalDetails().getHostNonOperationalDetails().add(reason.name().toLowerCase());
        }
    }

    private void addPowerManagementStateses(VersionCaps version, PowerManagementStatus[] values) {
        version.setPowerManagementStates(new PowerManagementStates());
        for (PowerManagementStatus status : values) {
            version.getPowerManagementStates().getPowerManagementStates().add(status.value());
        }
    }

    private void addStorageDomaintStates(VersionCaps version, StorageDomainStatus[] values) {
        version.setStorageDomainStates(new StorageDomainStates());
        for (StorageDomainStatus status : values) {
            version.getStorageDomainStates().getStorageDomainStates().add(status.value());
        }
    }

    // Gluster related types and states
    private void addGlusterVolumeTypes(VersionCaps version, GlusterVolumeType[] types) {
        version.setGlusterVolumeTypes(new GlusterVolumeTypes());
        for (GlusterVolumeType type : types) {
            version.getGlusterVolumeTypes().getGlusterVolumeTypes().add(type.value());
        }
    }

    private void addTransportTypes(VersionCaps version, TransportType[] types) {
        version.setTransportTypes(new TransportTypes());
        for (TransportType type : types) {
            version.getTransportTypes().getTransportTypes().add(type.value());
        }
    }

    private void addGlusterVolumeStates(VersionCaps version, GlusterState[] states) {
        version.setGlusterVolumeStates(new GlusterStates());
        for (GlusterState type : states) {
            version.getGlusterVolumeStates().getGlusterStates().add(type.value());
        }
    }

    private void addGlusterBrickStates(VersionCaps version, GlusterState[] states) {
        version.setBrickStates(new GlusterStates());
        for (GlusterState type : states) {
            version.getBrickStates().getGlusterStates().add(type.value());
        }
    }

    private void addGlusterHookContentTypes(VersionCaps version, HookContentType[] values) {
        version.setContentTypes(new ContentTypes());
        for (HookContentType type : values) {
            version.getContentTypes().getContentTypes().add(type.value());
        }
    }

    private void addGlusterHookStates(VersionCaps version, HookStatus[] values) {
        version.setHookStates(new HookStates());
        for (HookStatus status : values) {
            version.getHookStates().getHookStates().add(status.value());
        }
    }

    private void addStages(VersionCaps version, HookStage[] values) {
        version.setStages(new Stages());
        for (HookStage stage : values) {
            version.getStages().getStages().add(stage.value());
        }
    }

    private void addPmProxyTypes(VersionCaps version, PmProxyType[] values) {
        version.setPmProxyTypes(new PmProxyTypes());
        for (PmProxyType pmProxyType : values) {
            version.getPmProxyTypes().getPmProxyTypes().add(pmProxyType.value());
        }
    }

    private void addStepEnumTypes(VersionCaps version, StepEnum[] states) {
        version.setStepTypes(new StepTypes());
        for (StepEnum type : states) {
            version.getStepTypes().getStepType().add(type.value());
        }
    }

    private void addAuthenticationMethods(VersionCaps version, AuthenticationMethod[] values) {
        version.setAuthenticationMethods(new org.ovirt.engine.api.model.AuthenticationMethods());
        for (AuthenticationMethod authType : values) {
            version.getAuthenticationMethods().getAuthenticationMethod().add(authType.value());
        }
    }

    private void addSerialNumberPolicies(VersionCaps version, SerialNumberPolicy[] values) {
        if (VersionUtils.greaterOrEqual(version, VERSION_3_5)) {
            version.setSerialNumberPolicies(new SerialNumberPolicies());
            for (SerialNumberPolicy mode : values) {
                version.getSerialNumberPolicies().getSerialNumberPolicies().add(mode.value());
            }
        }
    }

    private void addKdumpStates(VersionCaps version, KdumpStatus... values) {
        if (VersionUtils.greaterOrEqual(version, VERSION_3_5)) {
            version.setKdumpStates(new KdumpStates());
            for (KdumpStatus status : values) {
                version.getKdumpStates().getKdumpStates().add(status.value());
            }
        }
    }

    private void addSELinuxModes(VersionCaps version, SeLinuxMode[] values) {
        if (VersionUtils.greaterOrEqual(version, VERSION_3_5)) {
            version.setSelinuxModes(new SeLinuxModes());
            for (SeLinuxMode mode : values) {
                version.getSelinuxModes().getSeLinuxModes().add(mode.value());
            }
        }
    }

    private void addRngSources(VersionCaps ver, RngSource[] vals) {
        if (VersionUtils.greaterOrEqual(ver, VERSION_3_5)) {
            ver.setRngSources(new RngSources());
            for (RngSource src : vals) {
                ver.getRngSources().getRngSources().add(src.name());
            }
        }
    }

    private void addPolicyUnitTypes(VersionCaps version, PolicyUnitType[] values) {
        version.setSchedulingPolicyUnitTypes(new SchedulingPolicyUnitTypes());
        for (PolicyUnitType policyUnitType : values) {
            version.getSchedulingPolicyUnitTypes()
                    .getSchedulingPolicyUnitTypes()
                    .add(policyUnitType.name().toLowerCase());
        }
    }

    private void addSupportedQosTypes(VersionCaps version) {
        version.setQosTypes(new QosTypes());
        addQosTypes(version, QosType.NETWORK);
        if (VersionUtils.greaterOrEqual(version, VERSION_3_5)) {
            addQosTypes(version, QosType.STORAGE, QosType.CPU);
        }
        if (VersionUtils.greaterOrEqual(version, VERSION_3_6)) {
            addQosTypes(version, QosType.HOSTNETWORK);
        }
    }

    private void addQosTypes(VersionCaps version, QosType... qosTypesToAdd) {
        List<String> supportedQosTypeNames = version.getQosTypes().getQosTypes();
        for (QosType qosType : qosTypesToAdd) {
            String qosTypeAsString = qosType.name().toLowerCase();
            supportedQosTypeNames.add(qosTypeAsString);
        }
    }

    private void addSpmStates(VersionCaps version, SpmStatus[] values) {
        if (VersionUtils.greaterOrEqual(version, VERSION_3_5)) {
            SpmStates states = new SpmStates();
            for (SpmStatus state : values) {
                states.getSpmStates().add(state.value());
            }
            version.setSpmStates(states);
        }
    }

    private void addVmPoolTypes(VersionCaps version, VmPoolType[] values) {
        if (VersionUtils.greaterOrEqual(version, VERSION_3_6)) {
            VmPoolTypes types = new VmPoolTypes();
            for (VmPoolType state : values) {
                types.getVmPoolTypes().add(state.value());
            }
            version.setVmPoolTypes(types);
        }
    }

    private void addInheritableBooleans(VersionCaps version, InheritableBoolean[] values) {
        if (VersionUtils.greaterOrEqual(version, VERSION_3_6)) {
            version.setInheritableBooleans(new InheritableBooleans());
            for (InheritableBoolean bool : values) {
                version.getInheritableBooleans().getInheritableBooleans().add(bool.value());
            }
        }
    }

    private void addNetworkPluginTypes(VersionCaps version, NetworkPluginType[] values) {
        if (VersionUtils.greaterOrEqual(version, VERSION_3_6)) {
            NetworkPluginTypes types = new NetworkPluginTypes();
            for (NetworkPluginType type : values) {
                types.getNetworkPluginTypes().add(type.value());
            }
            version.setNetworkPluginTypes(types);
        }
    }

    private void addMessageBrokerTypes(VersionCaps version, MessageBrokerType[] values) {
        if (VersionUtils.greaterOrEqual(version, VERSION_3_6)) {
            MessageBrokerTypes types = new MessageBrokerTypes();
            for (MessageBrokerType type : values) {
                types.getMessageBrokerTypes().add(type.value());
            }
            version.setMessageBrokerTypes(types);
        }
    }

    private void addQuotaModeTypes(VersionCaps version) {
        if (VersionUtils.greaterOrEqual(version, VERSION_3_6)) {
            version.setQuotaModeTypes(new QuotaModeTypes());
            for (QuotaModeType mode : QuotaModeType.values()) {
                version.getQuotaModeTypes().getQuotaModeTypes().add(mode.value());
            }
        }
    }

    @Override
    public CapabiliyResource getCapabilityResource(String id) {
        return new BackendCapabilityResource(id, this);
    }
}
