import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Car firstCar = new Car("Mercedes",2025,82_000);
        Car secondCar = new Car("Fiat",2023,16_000);
        char currency = '€';

        System.out.println(firstCar.brand);
        System.out.println(firstCar.year);
        System.out.println(currency + firstCar.price); // can you explain why this changes the price? LOL
        System.out.println("\n");
        System.out.println(secondCar.brand);
        System.out.println(secondCar.year);
        System.out.println(currency + "" + secondCar.price);
    }


    public static void firstPractice() {
        ArrayList<Integer> userInputArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        int count = 0;
        int findNumber = 50;
        while(count < 10){
            System.out.printf("[%s] Enter a number: ", count);
            userInputArray.add(scanner.nextInt());
            count++;
        }
        if (userInputArray.contains(findNumber)){
            System.out.printf("\nFound the value (50) at index -> %s", userInputArray.indexOf(findNumber));
        } else {
            System.out.println("\nThe given value was not found!");
        }
    }
}

