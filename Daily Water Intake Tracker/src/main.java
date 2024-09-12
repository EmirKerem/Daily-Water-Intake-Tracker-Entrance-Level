
import java.util.Scanner;

public class main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome!");
        System.out.println("Please enter your weight to see the recommended daily water intake.");
        double weight = scanner.nextDouble();
        weight = weight * 35;
        
        
        System.out.println("Your recommended daily water intake is " + weight + " milliliters.");
        System.out.println("Please enter your daily water intake goal in milliliters.");
        double goal = scanner.nextDouble();
        
        if (weight < goal) {
            System.out.println("Please be mindful of your water intake. Consuming more than the recommended amount can lead to water intoxication.");
        } else {
            if (goal <= 0) {
                System.out.println("Please enter a positive number.");
            } else {
                System.out.println("Your goal is " + goal + " milliliters.");
        
                while (goal > 0)  {
                    System.out.println("Enter the amount of water you've consumed.");
                    double consumed = scanner.nextDouble();
                    
                    if (consumed > goal) {
                        double excess = consumed - goal;
                        System.out.println("You've exceeded your goal by " + excess + " milliliters.");
                        break;
                    } else {
                        goal = goal - consumed;
                        System.out.println("You have " + goal + " milliliters left to reach your goal.");
                    }
                }
                System.out.println("Congratulations! You've reached your goal!!!");
            }
        }
    }
}

