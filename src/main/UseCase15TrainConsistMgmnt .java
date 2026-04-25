import java.util.*;

public class UseCase15TrainConsistMgmnt {

    // ---- CUSTOM RUNTIME EXCEPTION
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ---- Goods Bogie Class
    static class GoodsBogie {
        String shape;   // Rectangular / Cylindrical
        String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Method to assign cargo safely
        public void assignCargo(String cargo) {
            try {
                // Rule: Rectangular bogie cannot carry Petroleum
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe Assignment: Rectangular bogie cannot carry Petroleum"
                    );
                }

                // Valid assignment
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + shape + " -> " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed for " + shape + " bogie\n");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("=========================================\n");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe case
        b1.assignCargo("Petroleum");

        // Unsafe case
        b2.assignCargo("Petroleum");

        // Another safe case (program continues)
        b2.assignCargo("Coal");

        System.out.println("UC15 cargo assignment completed ...");
    }
}