
import java.util.ArrayList;
import java.util.Scanner;

public class numlist {
    public static void main(String args[]) {
        ArrayList<String> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            displayMenu();
            int choice = makeAChoice(sc, 1, 9);

            if (choice == 1) {
                displaynumbers(numbers);
            }

            if (choice == 2) {
                addnumber(numbers, sc);
            }

            if (choice == 3) {
                editnumber(numbers, sc);
            }

            if (choice == 4) {
                deletenumber(numbers, sc);
            }

            if (choice == 5) {
                numbers.clear();
                System.out.println("All numbers cleared.");
            }

            if (choice == 6) {
                calculateMean(numbers);
            }

            if (choice == 7) {
                calculateMedian(numbers);
            }

            if (choice == 8) {
                calculateMode(numbers);
            }

            if (choice == 9) {
                break;
            }
        }
        System.out.println("Goodbye!");
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("1. Show all numbers");
        System.out.println("2. Add a new number");
        System.out.println("3. Edit a number");
        System.out.println("4. Delete a number");
        System.out.println("5. Clear all numbers");
        System.out.println("6. Calculate mean");
        System.out.println("7. Calculate median");
        System.out.println("8. Calculate mode");
        System.out.println("9. Quit");
    }

    public static int makeAChoice(Scanner sc, int lowerBound, int upperBound) {
        int choice;
        while (true) {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            // clear the keyboard buffer to get rid of the \n in there
            sc.nextLine();
            System.out.println("Your choice: " + choice);
            if (choice >= lowerBound && choice <= upperBound) {
                break;
            } else {
                System.out.println("Please enter between " + lowerBound + " to " + upperBound);
            }
        }
        return choice;
    }

    public static void displaynumbers(ArrayList<String> numbers) {
        System.out.println();
        System.out.println("Displaying all numbers");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(i + ". " + numbers.get(i));
        }
    }

    public static void editnumber(ArrayList<String> numbers, Scanner sc) {
        System.out.println();
        System.out.println("Edit number");
        displaynumbers(numbers);
        System.out.print("Choose the number to edit: ");
        
        int numberIndex = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the new number: ");
        String newnumberName = sc.nextLine();
        numbers.set(numberIndex, newnumberName);
    }

    public static void deletenumber(ArrayList<String> numbers, Scanner sc) {
        System.out.println("Delete number");

        System.out.println("Edit number");
        displaynumbers(numbers);
        System.out.print("Choose the number to edit: ");
        
        int numberIndex = sc.nextInt();
        sc.nextLine();

        numbers.remove(numberIndex);
    }
    public static void calculateMean(ArrayList<Double> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("No numbers to calculate the mean.");
            return;
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double mean = sum / numbers.size();
        System.out.printf("Mean: ", mean);
    }

    public static void calculateMedian(ArrayList<Double> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("No numbers to calculate the median.");
            return;
        }
        Collections.sort(numbers);
        double median;
        int size = numbers.size();
        if (size % 2 == 0) {
            median = (numbers.get(size / 2 - 1) + numbers.get(size / 2)) / 2;
        } else {
            median = numbers.get(size / 2);
        }
        System.out.printf("Median: ", median);
    }

    public static void calculateMode(ArrayList<Double> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("No numbers to calculate the mode.");
            return;
        }
    
        Collections.sort(numbers);
        
        double mode = numbers.get(0);
        int maxCount = 1;
        int currentCount = 1;
    
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).equals(numbers.get(i - 1))) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mode = numbers.get(i - 1);
                }
                currentCount = 1;
            }
        }
    
        if (currentCount > maxCount) {
            mode = numbers.get(numbers.size() - 1);
            maxCount = currentCount;
        }
    
        System.out.printf("Mode: ", mode, maxCount);
    }

    public static void addnumber(ArrayList<String> numbers, Scanner sc) {
        System.out.println();
        System.out.println("Add new number");
        System.out.print("Enter the number: ");
        String numberName = sc.nextLine(); 
        numbers.add(numberName);

    }
}