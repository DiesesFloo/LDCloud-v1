package eu.diesesfloo.ldcloud.api.group;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public interface CloudGroupProvider {

    CloudGroup getGroup(String name);

    CompletableFuture<CloudGroup> getGroupAsync(String name);

    Set<CloudGroup> getGroups(GroupType type);

    CompletableFuture<Set<CloudGroup>> getGroupsAsync(GroupType type);

    Set<CloudGroup> getGroups();

    CompletableFuture<Set<CloudGroup>> getGroupsAsync();

    void createGroup(CloudGroup group);

    void deleteGroup(String name);

    void deleteGroup(CloudGroup group);

}
