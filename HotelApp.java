public class HotelApp {
    public static void main(String[] args) {
        // creating facade class
        FrontDesk frontDesk = new FrontDesk();

        // testing valet class
        frontDesk.pickUpVehicle("ABC123");
        // testing housekeeping class
        frontDesk.cleanRoom(10);
        // testing cart class
        frontDesk.requestCart(5);
    }
}
