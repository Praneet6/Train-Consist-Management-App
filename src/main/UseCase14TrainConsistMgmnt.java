import java.util.*;

public class UseCase14TrainConsistMgmnt {

    // ---- CUSTOM EXCEPTION
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ---- Passenger Bogie Class with Validation
    static class PassengerBogie {
        String name;
        int capacity;

        public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.name = name;
            this.capacity = capacity;
        }

        public void display() {
            System.out.println(name + " -> " + capacity);
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("==================================");

        try {
            // Valid Bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.print("Created Bogie: ");
            b1.display();

            // Invalid Bogie (will throw exception)
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            System.out.print("Created Bogie: ");
            b2.display();

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed ...");
    }
}