package Task3.application;

/** Protected Variations: SMS/e-mail/месенджер можна замінити без змін ядра. */
public interface NotificationSender {
    void send(String phone, String text);
}
