import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - UseCase1TrainConsistMgmnt
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * Initializes an empty train consist and displays its state.
 *
 * Concepts:
 * - Class & Main Method
 * - List Interface
 * - ArrayList
 * - Console Output
 */

public class UseCase1TrainConsistMgmnt {

    public static void main(String[] args) {

        // Welcome Banner
        System.out.println("====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================\n");

        // Initialize Train Consist (Dynamic List)
        List<String> trainConsist = new ArrayList<>();

        // Display Initial State
        System.out.println("Train initialized successfully ...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations ...");
    }
}