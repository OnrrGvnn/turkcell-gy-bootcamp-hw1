public class CustomerManager {
    Customer customer;
    ICreditManager creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }

    public void Save() {
        System.out.println("Müşteri Kaydedili: ");
    }

    public void Delete() {
        System.out.println("Müşteri Silindi: ");
    }

    public void GiveCredit() {
        creditManager.Calculate();
        System.out.println("Kredi verildi: ");
    }

}