package src.oop.ls8AbstractClassDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new MySqlDatabaseManager();
        customerManager.getCustomer();
    }
}
