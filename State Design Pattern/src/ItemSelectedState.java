public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Please insert coins.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        machine.addBalance(amount);
        System.out.println("Coin inserted. Current balance: " + machine.getBalance());
        if (machine.getBalance() >= machine.getItemPrice()) {
            machine.setState(new DispensingState());
        }
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        if (machine.getBalance() >= machine.getItemPrice()) {
            System.out.println("Dispensing item...");
            machine.decreaseInventory();
            machine.setBalance(0);
            machine.setState(new IdleState());
        } else {
            System.out.println("Cannot dispense item. Insert more coins.");
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}