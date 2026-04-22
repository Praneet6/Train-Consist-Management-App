import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * MAIN CLASS - UseCase13TrainConsistMgmnt
 *
 * Use Case 13: Performance Comparison (Loops vs Streams)
 *
 * Compares execution time of loop-based filtering vs stream-based filtering
 * using System.nanoTime().
 */
public class UseCase13TrainConsistMgmnt {

    // Bogie model
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC13 - Performance Comparison (Loops vs Streams) ===");

        // Create dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("General", 90));
        }

        // -------- LOOP BASED FILTER --------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------- STREAM BASED FILTER --------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // -------- OUTPUT --------
        System.out.println("\nLoop Result Size   : " + loopResult.size());
        System.out.println("Stream Result Size : " + streamResult.size());

        System.out.println("\nExecution Time:");
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");

        System.out.println("\nUC13 performance comparison completed ...");
    }
}