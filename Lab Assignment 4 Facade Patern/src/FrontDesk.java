public class FrontDesk
{
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk()
    {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void requestValetService(String plateNumber)
    {
        valet.pickUpVehicle(plateNumber);
    }

    public void requestHouseKeepingService(int roomNumber)
    {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCartService(int numberOfCart)
    {
        cart.requestCart(numberOfCart);
    }

}
