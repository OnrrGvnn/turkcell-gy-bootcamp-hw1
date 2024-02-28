public class Main {
    public static void main(String[] args) {
        /*BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger()};
        for (BaseLogger baseLogger : loggers) {
            baseLogger.log("Log Mesajı");
        }*/

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.Add();

    }
}