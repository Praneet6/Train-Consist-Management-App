import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - UseCase12TrainConsistMgmnt
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * This class validates goods bogies against railway safety rules
 * using Java Streams and conditional logic.
 *
 * At this stage, the application:
 * - Creates goods bogie objects
 * - Stores them in a list
 * - Applies stream validation using allMatch()
 * - Checks cylindrical bogie safety rule
 * - Displays compliance result
 *
 * This maps safety rule enforcement using Streams.
 *
 * @author Developer
 * @version 12.0
 */

public class UseCase12TrainConsistMgmnt {

    // Goods Bogie Model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC12 - Safety Compliance Check for Goods Bogies ===");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Display bogies
        System.out.println("\nGoods Bogies:");
        for (GoodsBogie bogie : goodsBogies) {
            System.out.println(bogie);
        }

        // Safety validation rule:
        // Cylindrical bogies must carry only Petroleum
        boolean isSafe = goodsBogies.stream()
                .allMatch(bogie ->
                        !bogie.type.equals("Cylindrical")
                                || bogie.cargo.equals("Petroleum"));

        // Display result
        System.out.println("\nSafety Compliance Result:");
        System.out.println("Train Safety Compliant: " + isSafe);

        System.out.println("\nUC12 safety validation completed ...");
    }
}