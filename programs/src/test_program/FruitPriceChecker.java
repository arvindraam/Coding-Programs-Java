package test_program;

import java.util.HashMap;
import java.util.Scanner;

public class FruitPriceChecker {

    // List of fruits with their prices
    private static final HashMap<String, Integer> fruits = new HashMap<>();

    static {
        fruits.put("apple", 100);
        fruits.put("banana", 30);
        fruits.put("cherry", 150);
        fruits.put("date", 200);
        fruits.put("grape", 60);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the fruit: ");
        String fruitName = scanner.nextLine().trim().toLowerCase();

        Thread thread = new Thread(() -> getFruitPrice(fruitName));
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Processing was interrupted.");
        }

        scanner.close();
    }

    private static void getFruitPrice(String fruitName) {
        if (fruits.containsKey(fruitName)) {
            System.out.println("Processing your request. Please wait...");
            try {
                Thread.sleep(10000); // Simulate processing time
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
                return;
            }
            System.out.println("The price of " + fruitName + " is " + fruits.get(fruitName) + ".");
        } else {
            System.out.println("Sorry, " + fruitName + " is not available in the list.");
        }
    }

}
