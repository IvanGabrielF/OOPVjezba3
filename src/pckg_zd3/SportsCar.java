package pckg_zd3;

public class SportsCar extends Vehicle {

    public SportsCar(String model, String brand, String color) {
        super(model, brand);
        this.color = color;

    }

    @Override
    public void startVehicle() {
        System.out.println("WROOM WROOM");
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", vehID=" + vehID +
                ", productDate=" + (productDate != null ? dateFormat.format(productDate) : "N/A") +
                '}';
    }
}
