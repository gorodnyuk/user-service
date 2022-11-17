package uk.gorodny.userservice.service;

import org.springframework.stereotype.Service;
import uk.gorodny.userservice.dto.User;

/**
 * Заглушка для получения пользователя.
 */
@Service
public class DummyUserService implements UserService {

    @Override
    public User getUser(String name, Integer age) {
        return new User(name, age);
    }
}
