public class HotelApp
{
    private FrontDesk frontDesk;

    public HotelApp()
    {
        frontDesk = new FrontDesk() ;
    }

    public void requestServices()
    {
        frontDesk.requestValetService("AHA-4228");
        frontDesk.requestHouseKeepingService(236);
        frontDesk.requestCartService(4);
    }

    public static void main(String []args)
    {
        HotelApp app = new HotelApp();
        app.requestServices();
    }
}
