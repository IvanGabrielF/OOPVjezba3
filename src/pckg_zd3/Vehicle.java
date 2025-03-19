package pckg_zd3;


import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {

    protected String color;
    protected String brand;
    protected String model;
    SimpleDateFormat dateFormat;
    int vehID;
    private static int cntID = 50;
    Date productDate;


    public Vehicle(String model, String brand){
        this.brand = brand;
        this.model = model;
        this.vehID = cntID++;
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    }

    public void setDate(String dateMade){
        try {
            productDate = dateFormat.parse(dateMade);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    public void setProductDate(String productDate) {
        try{
            this.productDate = dateFormat.parse(productDate);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
    //parsiraju String datum u pravi Date objekt pomoću SimpleDateFormat

    public void startVehicle(){
        System.out.println("Starting engine...");
    }

    public void stopVehicle(){
        System.out.println("Stopping engine...");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", dateFormat=" + dateFormat +
                ", vehID=" + vehID +
                ", productDate=" + productDate +
                '}';
    }

    public void vehInfo(){
        System.out.println("Vehicle information: ");
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Vehicle id: " + vehID);

        if (productDate != null){
            System.out.println("Production date: " + dateFormat.format(productDate));
        }else {
            System.out.println("Production date not available");
        }
    }
}
