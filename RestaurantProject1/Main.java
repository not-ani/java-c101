import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Restaurant name (example: Ani's Restaurant): ");
        String name = scanner.nextLine();

        System.out.print("Wait time in minutes (example: 30): ");
        int waitTimeMinutes = Integer.parseInt(scanner.nextLine());

        System.out.print("Rating from 1 to 5 (example: 5): ");
        int rating = Integer.parseInt(scanner.nextLine());

        System.out.print("Price range (example: $55 - $85): ");
        String priceRange = scanner.nextLine();

        System.out.print("Hours open (example: Mon-Fri 10am-11pm, Sat-Sun closed): ");
        String hoursOpen = scanner.nextLine();

        Restaurant restaurant = new Restaurant(name, waitTimeMinutes, rating, priceRange, hoursOpen);
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(restaurant);

        System.out.println("\nRestaurant saved:");
        for (Restaurant savedRestaurant : restaurants) {
            System.out.println(savedRestaurant);
        }
    }
}
