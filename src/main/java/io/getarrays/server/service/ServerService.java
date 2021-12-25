package io.getarrays.server.service;

import io.getarrays.server.model.Server;

import java.net.UnknownHostException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws UnknownHostException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);

}
