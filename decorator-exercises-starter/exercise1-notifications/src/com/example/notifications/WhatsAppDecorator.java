package com.example.notifications;

public class WhatsAppDecorator extends NotifierDecorator {
    private String whatsappId;

    public WhatsAppDecorator(Notifier wrappee, String whatsappId) {
        super(wrappee);
        this.whatsappId = whatsappId;
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        sendWhatsApp(message);
    }

    private void sendWhatsApp(String message) {
        // Simulate sending WhatsApp message
        System.out.println("[WHATSAPP -> " + whatsappId + "]: " + message);
    }
    
}
