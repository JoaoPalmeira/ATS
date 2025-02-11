package Model;

import Exceptions.InvalidUserException;
import Exceptions.UserExistsException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

class Users implements Serializable {
    private static final long serialVersionUID = 7586838070562585444L;
    private final Map<String, User> userBase;

    Users() {
        this.userBase = new HashMap<>();
    }

    void addUser(User u) {
        this.userBase.putIfAbsent(u.getEmail(), u.clone());
    }

    List<String> getClientIDS() {
        return new ArrayList<>(this
                .userBase
                .keySet());
    }

    User getUser(String id)  {
        User a = userBase.get(id);
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) return false;

        Users users = (Users) o;
        return this.userBase.equals(users.userBase);
    }
}
