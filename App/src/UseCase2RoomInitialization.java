/**
 * Book My Stay App
 *
 * This class demonstrates basic room modeling using abstraction,
 * inheritance, and static availability representation.
 *
 * @author YourName
 * @version 2.1
 */
abstract class Room {
    private String type;
    private int beds;
    private double price;

    public Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getBeds() {
        return beds;
    }

    public double getPrice() {
        return price;
    }

    // Common display behavior
    public void displayDetails() {
        System.out.println("Room Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Price: ₹" + price);
    }
}

// Concrete Room Types
class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 1, 2000);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 2, 3500);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 3, 5000);
    }
}

// Main Application Class
public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" Book My Stay - Room Overview");
        System.out.println(" Version: v2.1");
        System.out.println("====================================\n");

        // Step 1: Create Room Objects (Polymorphism)
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Step 2: Static Availability (simple variables)
        int singleAvailability = 5;
        int doubleAvailability = 3;
        int suiteAvailability = 2;

        // Step 3: Display Room Details + Availability
        System.out.println("Available Room Types:\n");

        single.displayDetails();
        System.out.println("Available Units: " + singleAvailability);
        System.out.println("---------------------------");

        doubleRoom.displayDetails();
        System.out.println("Available Units: " + doubleAvailability);
        System.out.println("---------------------------");

        suite.displayDetails();
        System.out.println("Available Units: " + suiteAvailability);
        System.out.println("---------------------------");
    }
}
}
