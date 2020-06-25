package org.wiyi.generic;


import org.wiyi.generic.domain.User;

import java.util.LinkedList;

public class UserRepository implements CrudRepository<User> {

    private final LinkedList<User> users = new LinkedList<User>();

    @Override
    public User find() {
        return users.getFirst();
    }

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public boolean contain(User user) {
        return users.contains(user);
    }
}
