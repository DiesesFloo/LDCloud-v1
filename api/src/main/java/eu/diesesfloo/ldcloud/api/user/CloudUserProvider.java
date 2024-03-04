package eu.diesesfloo.ldcloud.api.user;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface CloudUserProvider {

    CloudUser getUser(UUID uuid);

    CompletableFuture<CloudUser> getCloudUserAsync(UUID uuid);

    void updateUser(UUID uuid, CloudUser user);

    Set<CloudUser> getUsers();

    CompletableFuture<Set<CloudUser>> getUsersAsync();

}
