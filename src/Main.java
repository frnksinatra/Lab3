import java.util.Scanner;

/**
 * prompt the user to enter an integer
 * display a table of squares and cubes from 1 to the value entered.
 * ask if the user wants to continue
 * assume that the user will enter valid data.
 * only continue if the user agrees to
 * <p>
 * <p>
 * make
 */


public class Main {




    public static void main(String[] args) {

        String userContinue = "y";
        int userInput;

        while (userContinue.equalsIgnoreCase("y")) {


            System.out.println("Learn your squares and cubes!");
            System.out.println();
            System.out.println("Enter an integer:");


            Scanner scan = new Scanner(System.in);


            while (!scan.hasNextInt()) {
                System.out.println("That isn't a number!");
                scan.nextLine();
            }
            userInput = scan.nextInt();


            System.out.printf("%s%16s%16s\n", "x", "x^2", "x^3");
            System.out.println("=================================");

            for (int i = 1; i <= userInput; i++) {

                System.out.printf("%d%16d%16d\n", i, (i + ((int) Math.pow(i, 2))), ((int) Math.pow(i, 3)));
            }
            System.out.println("Want to use a different number? (y/n)");
            userContinue = scan.next();
        }
        System.out.println("goodbye!");
    }
}