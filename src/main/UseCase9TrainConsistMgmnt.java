import java.util.*;
import java.util.stream.Collectors;

/**
 * MAIN CLASS - UseCase9TrainConsistMgmnt
 *
 * Use Case 9: Group Bogies by Type
 *
 * Description:
 * Groups bogies using Stream API and Collectors.groupingBy()
 *
 * @author Developer
 * @version 9.0
 */

public class UseCase9TrainConsistMgmnt {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Capacity -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("========================================\n");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        // ---- DISPLAY ALL ----
        System.out.println("All Bogies:");
        bogies.forEach(b -> System.out.println(b.name + " -> " + b.capacity));

        // ---- GROUPING ----
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // ---- DISPLAY GROUPED ----
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nBogie Type: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println(b);
            }
        }

        System.out.println("\nUC9 grouping completed ...");
    }
}