// scanner: allows user to input into java program
// create a new scanner object 1st
// Scanner sc: sc is a variable that can store objects
// new Scanner(system.in)

import java.util.Scanner;

public class bmiCalculator {
    public static void bmiCalculator(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Weight: ");
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your bmi is " + bmi);
        // use nextFloat when making games/graphic programs
    }
}
