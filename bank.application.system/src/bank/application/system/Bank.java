package bank.application.system;
public class Bank {
    public static void main(String[] args) {

        Account savings = new SavingsAccount(101, "Chaitanya", 5000);
        Account current = new CurrentAccount(102, "Reddy", 2000);

        System.out.println("\n--- Savings Account ---");
        savings.deposit(1000);
        savings.withdraw(4500);
        savings.display();

        ((SavingsAccount) savings).addInterest(); // Type casting
        savings.display();

        System.out.println("\n--- Current Account ---");
        current.deposit(2000);
        current.withdraw(8000);
        current.display();
    }
}

