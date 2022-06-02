package design_patterns.factory_method_pattern.demo1;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification...");
    }

}
