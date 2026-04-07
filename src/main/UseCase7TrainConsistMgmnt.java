import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * MAIN CLASS - UseCase7TrainConsistMgmnt
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * This class sorts passenger bogies based on seating
 * capacity using a custom Comparator.
 *
 * @author Developer
 * @version 7.0
 */

public class UseCase7TrainConsistMgmnt {

    // Inner Bogie class
    static class Bogie {
        String name;
        int capacity;

        // Constructor
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        // Display format
        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity ");
        System.out.println("========================================\n");

        // Create List of bogies
        List<Bogie> bogies = new ArrayList<>();

        // ---- ADD DATA ----
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // ---- BEFORE SORT ----
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ---- SORT USING COMPARATOR ----
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // ---- AFTER SORT ----
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nUC7 sorting completed ...");
    }
}