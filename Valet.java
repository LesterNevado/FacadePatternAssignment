public class Valet implements HotelService {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Vehicle Plate Number " + plateNumber + " has been picked up!");
    }
}