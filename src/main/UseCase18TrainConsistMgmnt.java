public class UseCase18TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("==========================================\n");

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchId = "BG309"; // change value to test

        boolean found = false;

        // ---- LINEAR SEARCH LOGIC
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchId)) {
                found = true;
                System.out.println("Bogie Found at position: " + i);
                break; // early termination
            }
        }

        // Result display
        if (!found) {
            System.out.println("Bogie ID not found in train consist.");
        }

        System.out.println("\nUC18 search completed ...");
    }
}