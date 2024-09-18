package src;

public class Vehicle {
    public String vehicleType;
    public String fuelType;

    public Vehicle(String vehicleType, String fuelType) {
        this.vehicleType = vehicleType;
        this.fuelType=fuelType;
    }

    public void move(){
     System.out.println("The vehicle is moving");
    }

}

