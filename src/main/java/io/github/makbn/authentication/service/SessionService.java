package io.github.makbn.authentication.service;

import io.github.makbn.authentication.model.Session;

import java.util.List;

public interface SessionService {

    Session getSessionBySS(String secureString);

    List<Session> getSessionByUserIdentifier(String id);

    void save(Session session);

    void update(Session session);

    void delete(Session session);
}
