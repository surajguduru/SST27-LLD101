package com.example.notifications;

public class SlackDecorator extends NotifierDecorator {
    private String channel;

    public SlackDecorator(Notifier wrappee, String channel) {
        super(wrappee);
        this.channel = channel;
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        sendSlack(message);
    }

    private void sendSlack(String message) {
        // Simulate sending Slack message
        System.out.println("[SLACK -> #" + channel + "]: " + message);
    }
    
}
