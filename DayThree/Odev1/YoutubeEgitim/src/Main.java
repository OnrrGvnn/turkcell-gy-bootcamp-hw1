public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.creditManager.Save();


        Customer customer1 = new Customer();
        customer1.id = 1;
        customer1.Name = "Onur";

    }
}