public class BankAccountClient {
    public static void main(String[] args) {
        // Initialize object using constructor (args)
        BankAccount b1 = new BankAccount("Jake", 40);

        // Add 500 to object's balance
        b1.deposit(500);
        System.out.println(b1);

        // Subtract 300 from object's balance
        b1.withdraw(300);
        System.out.println(b1);

        // Create object without intializing fields (no args)
        BankAccount b2 = new BankAccount();
        
        System.out.println(b2);

        // Set object fields using mutator methods
        b2.setName("Daisy Buchanan");
        b2.setBalance(100);

        System.out.println(b2);
    }
}
