public class ConsoleNotificationService implements NotificationService {

    @Override
    public void sendNotification(String Message) {
        System.out.println(Message);
    }
}
