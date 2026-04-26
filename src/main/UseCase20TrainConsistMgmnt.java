public class UseCase20TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("==========================================\n");

        // Example bogie array (try empty {} to test exception)
        String[] bogieIds = {};

        String searchId = "BG309";

        try {
            // ---- FAIL-FAST CHECK
            if (bogieIds.length == 0) {
                throw new IllegalStateException("Train has no bogies. Cannot perform search.");
            }

            boolean found = false;

            // ---- LINEAR SEARCH (can be reused logic)
            for (int i = 0; i < bogieIds.length; i++) {
                if (bogieIds[i].equals(searchId)) {
                    System.out.println("Bogie Found at position: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Bogie ID not found.");
            }

        } catch (IllegalStateException e) {
            // Handle exception gracefully
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed ...");
    }
}