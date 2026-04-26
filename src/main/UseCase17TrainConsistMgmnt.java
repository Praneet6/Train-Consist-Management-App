import java.util.Arrays;

public class UseCase17TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC17 - Sort Bogie Names Using Arrays.sort() ");
        System.out.println("==========================================\n");

        // Create array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original array
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // ---- SORT USING ARRAYS.SORT()
        Arrays.sort(bogieNames);

        // Display sorted array
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed ...");
    }
}