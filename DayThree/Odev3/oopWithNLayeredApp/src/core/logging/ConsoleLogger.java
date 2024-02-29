package core.logging;

public class ConsoleLogger implements BaseLogger {
    @Override
    public void log(String data) {
        System.out.println("Data logged in Console");
    }
}