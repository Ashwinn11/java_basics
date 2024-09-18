package src;

public class Car extends Vehicle{

    public String vehicleName;

    public String vehicleColor;

    public Car(String vehicleName, String vehicleColor,String fuelType) {
        super("car",fuelType);
        this.vehicleName = vehicleName;
        this.vehicleColor = vehicleColor;
    }

}


