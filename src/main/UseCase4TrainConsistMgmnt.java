import java.util.LinkedList;
import java.util.List;

/**
 * MAIN CLASS - UseCase4TrainConsistMgmnt
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 *
 * @author Developer
 * @version 4.0
 */

public class UseCase4TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("========================================\n");

        // Create a LinkedList
        List<String> trainConsist = new LinkedList<>();

        // ---- ADD INITIAL BOGIES ----
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // ---- INSERT AT POSITION ----
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // ---- REMOVE FIRST & LAST ----
        trainConsist.remove(0); // remove Engine
        trainConsist.remove(trainConsist.size() - 1); // remove Guard

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed ...");
    }
}