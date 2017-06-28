import java.util.Scanner;

/**
 * promt the user to enter an integer
 * display a table of squares and cubes from 1 to the value entered.
 * ask if the user wants to continue
 * assume that the user will enter valid data.
 * only continue if the user agrees to
 *
 *
 * make
 */



public class Main {

    public static void main(String[] args) {

        int userInput;

        System.out.println("Learn your squares and cubes!");
        System.out.println();
        System.out.println("Enter an integer:");
        Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
            }else {
                System.out.println("That isn't a number!");
            }
        for (int i = 1; i < userInput ; i++) {
            System.out.println((int) Math.pow(i,2));

        }
    }
}
