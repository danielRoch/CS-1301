public class BankAccount {
    private String name;
    private double balance;


    // Default constructor, no args 
    public BankAccount(){}

    // Constructor, args (constructor overloading)
    public BankAccount(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    // Mutator methods (Setters)
    public void setName(String name) 
    {
        this.name = name;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    // Accessor methods (Getters)
    public String getName() 
    {
        return this.name;
    }

    public double getBalance() 
    {
        return this.balance;
    }

    // Mutator methods (Incrementing / decrementing balance)
    public void deposit(double amount) 
    {
        this.balance += amount;
    }

    public void withdraw(double amount) 
    {
        this.balance -= amount;   
    }

    // String representation
    @Override
    public String toString() 
    {
        return ("Account holder: " + name + "\nBalance: $ " + balance + "\n");
    }

}