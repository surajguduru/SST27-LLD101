package com.example.notifications;

public class SMSDecorator extends NotifierDecorator {

    private String phoneNumber;

    public SMSDecorator(Notifier wrappee, String phoneNumber) {
        super(wrappee);
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        System.out.println("Sending SMS notification...");
    }

}
