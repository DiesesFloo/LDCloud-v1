package eu.diesesfloo.ldcloud.api.service;

import eu.diesesfloo.ldcloud.api.group.CloudGroup;
import eu.diesesfloo.ldcloud.api.user.CloudUser;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface CloudService {

    String getName();

    UUID getUUID();

    String getGroupName();

    CloudGroup getGroup();

    CompletableFuture<CloudGroup> getGroupAsync();

    void stop();

    int playerCount();

    List<CloudUser> getUsers();

    CompletableFuture<List<CloudUser>> getUsersAsync();

}
