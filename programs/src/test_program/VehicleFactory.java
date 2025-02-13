package test_program;

// Factory class to create Vehicle objects
public class VehicleFactory {
    // Factory method
    public static Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        } else if (vehicleType.equalsIgnoreCase("TRUCK")) {
            return new Truck();
        }
        throw new IllegalArgumentException("Unknown vehicle type");
    }

    public static void main(String[] args) {
        // Use the factory to create different vehicles
        Vehicle car = VehicleFactory.getVehicle("Car");
        car.create(); // Output: Car created!

        Vehicle bike = VehicleFactory.getVehicle("Bike");
        bike.create(); // Output: Bike created!

        Vehicle truck = VehicleFactory.getVehicle("Truck");
        truck.create(); // Output: Truck created!
    }
}
