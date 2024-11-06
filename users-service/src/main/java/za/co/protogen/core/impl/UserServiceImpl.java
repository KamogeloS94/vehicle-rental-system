package za.co.protogen.core.impl;

import za.co.protogen.core.UserService;
import za.co.protogen.domain.User;
import za.co.protogen.utility.Constant;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public void addUser(User user) {
        Constant.users.add(user);
    }

    @Override
    public void removeUser(Long id) {
        Constant.users.removeIf(user -> user.getId().equals(id));
    }

    @Override
    public User getUserById(Long id) {
        return Constant.users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(Constant.users);
    }

    @Override
    public void updateUser(User user) {
        int index = Constant.users.indexOf(getUserById(user.getId()));
        if (index >= 0) {
            Constant.users.set(index, user);
        }
    }

    @Override
    public List<User> searchUsers(String criteria) {
        return new ArrayList<>();
    }
}
