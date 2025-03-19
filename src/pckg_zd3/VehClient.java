package pckg_zd3;



public class VehClient {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Hilux","Toyota");
        vehicle1.setDate("01/01/2025");
        vehicle1.vehInfo();
        vehicle1.startVehicle();
        vehicle1.stopVehicle();


        SportsCar vehicle2 = new SportsCar("Skyline", "Nissan", "black");
        vehicle2.startVehicle();
        vehicle2.setDate("12/01/2002");
        System.out.println(vehicle2);
    }


}
