import java.util.Arrays;

public class UseCase19TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("==========================================\n");

        // Sorted array of bogie IDs (MANDATORY for Binary Search)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchId = "BG309"; // change to test

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // ---- BINARY SEARCH LOGIC
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(searchId);

            if (comparison == 0) {
                System.out.println("Bogie Found at position: " + mid);
                found = true;
                break;
            } else if (comparison < 0) {
                // move right
                low = mid + 1;
            } else {
                // move left
                high = mid - 1;
            }
        }

        // Result display
        if (!found) {
            System.out.println("Bogie ID not found in train consist.");
        }

        System.out.println("\nUC19 search completed ...");
    }
}