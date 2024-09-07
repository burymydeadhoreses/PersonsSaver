package io.github.burymydeadhoreses;

import jakarta.transaction.Transactional;

import java.util.UUID;

public class DbContext {
    static final Connector connector = new Connector();

    public static UUID addPerson(Person person) {
        try(var session = connector.getSession()) {
            session.beginTransaction();
            session.persist(person);
            session.getTransaction().commit();
        }

        return person.getId();
    }
}
