package za.co.protogen;

import za.co.protogen.core.UserService;
import za.co.protogen.core.impl.UserServiceImpl;
import za.co.protogen.domain.User;

public class Application {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        User newUser = new User();
        newUser.setId(3L);
        newUser.setFirstName("Alice");
        newUser.setLastName("Wonder");
        newUser.setDateOfBirth(java.time.LocalDate.of(1992, 8, 23));
        newUser.setRsaId("1122334455667");

        userService.addUser(newUser);
        System.out.println("All Users: " + userService.getAllUsers());
    }
}
