public class SuspendedState implements AccountState {
    @Override
    public void deposit(Account account, double amount) {
        System.out.println("You cannot deposit on a suspended account!");
    }

    @Override
    public void withdraw(Account account, double amount) {
        System.out.println("You cannot withdraw from a suspended account!");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is already suspended!");
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is activated!");
        account.setAccountState(new ActiveState());
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is closed!");
        account.setAccountState(new ClosedState());
    }
}