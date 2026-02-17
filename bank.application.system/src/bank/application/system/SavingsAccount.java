package bank.application.system;

class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 1000;
    private static final double INTEREST_RATE = 0.04; // 4%

    SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance ₹1000 required.");
        }
    }

    void addInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest added: ₹" + interest);
    }
}
