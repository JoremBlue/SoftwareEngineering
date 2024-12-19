public class UpSave implements BankAccDecorator {
    private BankAcc bankAcc;

    @Override
    public void setBankAccount(BankAcc bankAcc) {
        this.bankAcc = bankAcc;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.025;
    }

    @Override
    public double getBalance() {
        return bankAcc.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAcc.showBenefits() + ", GCash Transfer";
    }

    @Override
    public double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate());
    }

    @Override
    public String showInfo() {
        return bankAcc.showInfo();
    }
}

