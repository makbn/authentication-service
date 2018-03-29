package io.github.makbn.authentication.service;

import io.github.makbn.authentication.model.Session;

public interface SessionService {

    Session getSessionBySS(String secureString);

    Session getSessionByUserIdentifier(String id);

    void save(Session session);

    void update(Session session);
}
