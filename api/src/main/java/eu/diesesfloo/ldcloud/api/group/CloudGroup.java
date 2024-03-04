package eu.diesesfloo.ldcloud.api.group;

import org.jetbrains.annotations.NotNull;

public interface CloudGroup {

    @NotNull String getName();

    @NotNull GroupType getType();

    int maxMemory();

    int maxOnlineCount();

    boolean maintenanceMode();

    boolean isStatic();

    String requiredPermission();

}
