import java.util.*;

public class UseCase16TrainConsistMgmnt {

    // ---- Bubble Sort Method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparison
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println(" UC16 - Sort Bogies using Bubble Sort ");
        System.out.println("=========================================\n");

        // Passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original array
        System.out.println("Before Sorting:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // Apply Bubble Sort
        bubbleSort(capacities);

        // Display sorted array
        System.out.println("\n\nAfter Sorting:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed ...");
    }
}