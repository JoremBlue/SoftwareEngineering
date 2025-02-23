public class VendingMachine {
    private VendingMachineState state;
    private int inventory = 10;
    private int balance = 0;
    private final int itemPrice = 5;

    public VendingMachine() {
        this.state = new IdleState();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void selectItem() {
        state.selectItem(this);
    }

    public void insertCoin(int amount) {
        state.insertCoin(this, amount);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }

    public void setOutOfOrder() {
        state.setOutOfOrder(this);
    }

    public void addBalance(int amount) {
        this.balance += amount;
    }

    public void setBalance(int amount) {
        this.balance = amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getItemPrice() {
        return this.itemPrice;
    }

    public void decreaseInventory() {
        if (inventory > 0) {
            inventory--;
            System.out.println("Item dispensed. Remaining inventory: " + inventory);
        } else {
            System.out.println("Out of stock!");
            setOutOfOrder();
        }
    }
}

