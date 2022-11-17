package uk.gorodny.userservice.service;

import uk.gorodny.userservice.dto.User;

/**
 * Интерфейс для получения пользователя.
 */
public interface UserService {

    /**
     * Получить пользователя.
     *
     * @param name Имя пользователя.
     * @param age  Возраст пользователя.
     * @return пользователь.
     */
    User getUser(String name, Integer age);
}
