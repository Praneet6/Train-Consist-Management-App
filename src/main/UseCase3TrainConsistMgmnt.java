import java.util.HashSet;
import java.util.Set;

/**
 * MAIN CLASS - UseCase3TrainConsistMgmnt
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This class ensures that duplicate bogie IDs are not
 * added into the train formation using HashSet.
 *
 * @author Developer
 * @version 3.0
 */

public class UseCase3TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("=======================================\n");

        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (ignored automatically)
        bogies.add("BG101");
        bogies.add("BG102");

        // Display result
        System.out.println("After Adding Bogie IDs (duplicates ignored):");
        System.out.println("Unique Bogie IDs : " + bogies);

        System.out.println("\nTotal Unique Bogies : " + bogies.size());

        System.out.println("\nUC3 operations completed successfully ...");
    }
}