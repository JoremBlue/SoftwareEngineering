public class Cart implements HotelService
{
    @Override
    public void pickUpVehicle(String pickUpVehicle)
    {
    }

    @Override
    public void cleanRoom(int roomNumber)
    {
    }

    @Override
    public void requestCart(int numberOfCarts)
    {
        System.out.println("Requesting cart: " + numberOfCarts);
    }
}
