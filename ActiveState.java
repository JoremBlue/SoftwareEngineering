public class ActiveState implements AccountState {
    @Override
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited " + amount + ". Account number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
    }

    @Override
    public void withdraw(Account account, double amount) {
        if (amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawn " + amount + ". Account number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    @Override
    public void suspend(Account account) {
        System.out.println("Account is suspended!");
        account.setAccountState(new SuspendedState());
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is closed!");
        account.setAccountState(new ClosedState());
    }
}
