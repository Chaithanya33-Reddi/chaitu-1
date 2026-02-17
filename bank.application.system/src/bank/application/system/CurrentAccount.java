package bank.application.system;

class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 5000;

    CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance + OVERDRAFT_LIMIT >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

