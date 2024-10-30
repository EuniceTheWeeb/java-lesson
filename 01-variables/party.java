
import java.util.ArrayList;
import java.util.Scanner;

// define problem step-by-step

public class party {
    public static void main(String args[]) {
        ArrayList<String> partyList = new ArrayList<>();

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("1. Show all guests");
            System.out.println("2. Add a new guest");
            System.out.println("3. Edit a guest");
            System.out.println("4. Delete a guest");
            System.out.println("5. Quit");
    
            System.out.print("Enter a choice: ");
            int choice = sc.nextInt();
            System.out.println("You have selected: " + choice);
            
            if (choice==5) {
                break;
            }
        }
    }
}
