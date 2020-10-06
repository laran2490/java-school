package ru.mivr.first;

/**
 * Осуществление звонков по телефону
 */
public interface Phone {
    /**
     * Вызов другого абонента
     *
     * @param phoneNumber номер телефона абонента
     * @param user        пользователь, который звонит
     */
    void call(String phoneNumber, User user);
}
