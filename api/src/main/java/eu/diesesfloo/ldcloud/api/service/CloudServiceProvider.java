package eu.diesesfloo.ldcloud.api.service;

import eu.diesesfloo.ldcloud.api.group.CloudGroup;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface CloudServiceProvider {

    CloudService getService(String name);

    CompletableFuture<CloudService> getServiceAsync(String name);

    CloudService getService(UUID uuid);

    CompletableFuture<CloudService> getServiceAsync(UUID uuid);

    Set<CloudService> getServices(CloudGroup group);

    CompletableFuture<Set<CloudService>> getServicesAsync(CloudGroup group);

    Set<CloudService> getServices();

    CompletableFuture<Set<CloudService>> getServicesAsync();

    void registerService(CloudService service);

    void unregisterService(CloudService service);

    void unregisterService(String name);

}
