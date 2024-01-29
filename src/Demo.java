class InsufficientFundsException extends Exception {
    public InsufficientFundsException(int amount) {
        super("Insufficient funds to withdraw $" + amount);
    }
}

class NegativeAmountException extends RuntimeException {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    private String accountHolder;
    private int balance;

    public BankAccount(String accountHolder, int initialBalance) {
        if (initialBalance < 0) {
            throw new NegativeAmountException("Initial balance cannot be negative");
        }
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            throw new NegativeAmountException("Deposit amount cannot be negative");
        }
        balance += amount;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new NegativeAmountException("Withdrawal amount cannot be negative");
        }
        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return accountHolder + ": " + balance;
    }
}
