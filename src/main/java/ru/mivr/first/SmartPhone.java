package ru.mivr.first;

public class SmartPhone extends ButtonPhone {
    private String operationSystem;

    public SmartPhone(int year, int buttonsNumber, String operationSystem) {
        super(year, buttonsNumber);
        this.operationSystem = operationSystem;
    }

    @Override
    public void call(String phoneNumber, User user) {
        System.out.println(user + " звонить по номеру: " + phoneNumber + " потому что у него " + operationSystem);
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getOperationSystem() {
        return operationSystem;
    }
}
