package core.logging;

public class MailLogger implements BaseLogger {
    @Override
    public void log(String data) {
        System.out.println("Data logged in Mail");
    }
}