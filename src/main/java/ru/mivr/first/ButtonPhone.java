package ru.mivr.first;

public class ButtonPhone extends AbstractPhone {
    private final int buttonsNumber;

    public ButtonPhone(int year, int buttonsNumber) {
        super(year);
        this.buttonsNumber = buttonsNumber;
    }

    @Override
    public void call(String phoneNumber, User user) {
        System.out.println(user + " нажимает все кнопки своего старого кнопочного телефона набирая номера: " + phoneNumber);
    }

    public int getButtonsNumber() {
        return buttonsNumber;
    }
}
