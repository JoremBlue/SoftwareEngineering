public class HouseKeeping implements HotelService
{
    @Override
    public void pickUpVehicle(String plateNumber)
    {
    }

    @Override
    public void cleanRoom(int roomNumber)
    {
        System.out.println("Cleaning room: " + roomNumber);
    }

    @Override
    public void requestCart(int numberOfCarts)
    {
    }
}
