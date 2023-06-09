import java.util.ArrayList;
import java.util.Scanner;

public class VehicleManagement {
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    private Scanner scanner = new Scanner(System.in);

    private void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully.");
    }

    private void removeVehicleById(String id) {
        Vehicle vehicleToRemove = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(id)) {
                vehicleToRemove = vehicle;
                break;
            }
        }
        if (vehicleToRemove != null) {
            vehicles.remove(vehicleToRemove);
            System.out.println("Vehicle removed successfully.");
        } else {
            System.out.println("Vehicle doesn't exist with given id.");
        }
    }

    private void findVehicleByBrandAndColor() {
        System.out.print("Enter brand name: ");
        String brand = scanner.nextLine();
        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        ArrayList<Vehicle> matchedVehicles = new ArrayList<Vehicle>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getBrand().equalsIgnoreCase(brand) && vehicle.getColor().equalsIgnoreCase(color)) {
                matchedVehicles.add(vehicle);
            }
        }
        if (matchedVehicles.size() == 0) {
            System.out.println("No vehicle found with given brand and color.");
        } else {
            System.out.println("Matched vehicles: ");
            for (Vehicle vehicle : matchedVehicles) {
                System.out.println(vehicle.toString());
            }
        }
    }

    public void start() {
        boolean isExit = false;
        do {
            System.out.println("\nVehicle Management System");
            System.out.println("1. Add Vehicle\n2. Remove Vehicle by ID\n3. Find Vehicle by Brand and Color\n4. Exit\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Color: ");
                    String color = scanner.nextLine();

                    System.out.println("Select a vehicle type: ");
                    System.out.println("1. Car\n2. Motorbike\n3. Truck\nEnter your choice: ");
                    int vehicleChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (vehicleChoice) {
                        case 1:
                            System.out.print("Enter Number of Seats: ");
                            int numOfSeats = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter Engine Type: ");
                            String engineType = scanner.nextLine();
                            Car car = new Car(id, brand, year, price, color, numOfSeats, engineType);
                            addVehicle(car);
                            break;
                        case 2:
                            System.out.print("Enter Capacity: ");
                            String capacity = scanner.nextLine();
                            Motorbike motorbike = new Motorbike(id, brand, year, price, color, capacity);
                            addVehicle(motorbike);
                            break;
                        case 3:
                            System.out.print("Enter weight: ");
                            int weight = scanner.nextInt();
                            scanner.nextLine();
                            Truck truck = new Truck(id, brand, year, price, color, weight);
                            addVehicle(truck);
                            break;
                        default:
                            System.out.println("Invalid Choice!!");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Enter ID to remove: ");
                    String idToRemove = scanner.nextLine();
                    removeVehicleById(idToRemove);
                    break;
                case 3:
                    findVehicleByBrandAndColor();
                    break;
                case 4:
                    isExit = true;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid Choice!!");
                    break;
            }
        } while (!isExit);
    }
}
