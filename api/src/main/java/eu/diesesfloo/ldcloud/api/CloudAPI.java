package eu.diesesfloo.ldcloud.api;

import eu.diesesfloo.ldcloud.api.group.CloudGroupProvider;
import eu.diesesfloo.ldcloud.api.service.CloudServiceProvider;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class CloudAPI {

    @Getter
    static CloudAPI instance;

    public CloudAPI() {
        instance = this;
    }

    public static boolean isInitialized() {
        return CloudAPI.instance != null;
    }

    public abstract CloudGroupProvider getGroupProvider();

    public abstract CloudServiceProvider getServiceProvider();

    public abstract void stop();
}
