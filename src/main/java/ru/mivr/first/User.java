package ru.mivr.first;

public class User {
    private final String name;
    private final String phoneNumber;
    private final Phone phone;

    public User(String name, String phoneNumber, Phone phone) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.phone = phone;
    }

    public void callAnotherUser(User anotherUser) {
        phone.call(anotherUser.phoneNumber, this);
    }

    @Override
    public String toString() {
        return name;
    }
}
