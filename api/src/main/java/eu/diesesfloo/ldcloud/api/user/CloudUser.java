package eu.diesesfloo.ldcloud.api.user;

import eu.diesesfloo.ldcloud.api.service.CloudService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface CloudUser {

    @NotNull UUID getUUID();

    boolean isOnline();

    @NotNull Long getPlaytime();

    @NotNull CompletableFuture<Long> getPlaytimeAsync();

    @Nullable String getCurrentServiceName();

    @Nullable CompletableFuture<String> getCurrentServiceNameAsync();

    @Nullable CloudService getCurrentService();

    @Nullable CompletableFuture<CloudService> getCurrentServiceAsync();

}
