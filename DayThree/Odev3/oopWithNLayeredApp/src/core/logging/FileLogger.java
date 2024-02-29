package core.logging;

public class FileLogger implements BaseLogger {
    @Override
    public void log(String data) {
        System.out.println("Data logged in File");
    }
}