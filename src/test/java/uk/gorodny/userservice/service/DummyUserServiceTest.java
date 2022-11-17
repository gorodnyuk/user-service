package uk.gorodny.userservice.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uk.gorodny.userservice.dto.User;

class DummyUserServiceTest {

    private final UserService userService = new DummyUserService();

    @Test
    public void getUserTest() {
        User user = userService.getUser("John", 32);
        Assertions.assertEquals(new User("John", 32), user);
    }
}