import java.util.*;

class ParkingSystem {
    static int totalSlots = 5;
    static String[] parkingSlots = new String[totalSlots];

    // Park vehicle
    static void parkVehicle(String vehicleNumber) {
        for (int i = 0; i < totalSlots; i++) {
            if (parkingSlots[i] == null) {
                parkingSlots[i] = vehicleNumber;
                System.out.println("Vehicle parked at slot: " + (i + 1));
                return;
            }
        }
        System.out.println("Parking Full!");
    }

    // Remove vehicle
    static void removeVehicle(String vehicleNumber) {
        for (int i = 0; i < totalSlots; i++) {
            if (vehicleNumber.equals(parkingSlots[i])) {
                parkingSlots[i] = null;
                System.out.println("Vehicle removed from slot: " + (i + 1));
                return;
            }
        }
        System.out.println("Vehicle not found!");
    }

    // Display parking status
    static void displayStatus() {
        System.out.println("\nParking Status:");
        for (int i = 0; i < totalSlots; i++) {
            if (parkingSlots[i] == null) {
                System.out.println("Slot " + (i + 1) + ": Empty");
            } else {
                System.out.println("Slot " + (i + 1) + ": " + parkingSlots[i]);
            }
        }
    }

    // Available slots
    static void availableSlots() {
        int count = 0;
        for (String slot : parkingSlots) {
            if (slot == null) count++;
        }
        System.out.println("Available slots: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Parking System ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Display Status");
            System.out.println("4. Available Slots");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle number: ");
                    String v1 = sc.nextLine();
                    parkVehicle(v1);
                    break;

                case 2:
                    System.out.print("Enter vehicle number: ");
                    String v2 = sc.nextLine();
                    removeVehicle(v2);
                    break;

                case 3:
                    displayStatus();
                    break;

                case 4:
                    availableSlots();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
