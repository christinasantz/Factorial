import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get n from the user.
        System.out.print("Give a number and I will calculate its factorial for you!");
        try {
            int n = console.nextInt();
            //Get loop type from user
            System.out.println("How do you wish me to calculate the factorial?");
            System.out.println("Choose 1 for 'ForLoop', 2 for 'WhileLoop' or 3 for 'DoWhileLoop'.");
            int loopType = console.nextInt();


            switch (loopType) {
                case 1:
                    int factorial = forLoop(n);
                    //print n!
                    System.out.println(n + "! equals to " + factorial);
                    break;
                case 2:
                    int factorial2 = whileLoop(n);
                    //print n!
                    System.out.println(n + "! equals to " + factorial2);
                    break;
                case 3:
                    int factorial3 = doWhileLoop(n);
                    //print n!
                    System.out.println(n + "! equals to " + factorial3);
                    break;
            }

        }
        catch(Exception e){
            System.out.println("Try giving a physical number");
        }






    }
    //function to calculate n! with do-while loop
    private static int doWhileLoop(int n) {
        int i = 1;
        int factorial = 1;
        if (n == 0) {
            return factorial;
        } else {
            do {
                factorial = factorial * i;
                i++;
            } while (i <= n);
            return factorial;
        }
    }
    //function to calculate n! with while loop
    private static int whileLoop(int n) {
        int i = 1;
        int factorial = 1;
        if (n == 0) {
            return factorial;
        } else {
            while (i <= n) {
                factorial = factorial * i;
                i++;
            }
            return factorial;
        }
    }
    //function to calculate n! with for loop
    private static int forLoop(int n) {
        int i = 1;
        int factorial = 1;
        if (n == 0) {
            return factorial;
        } else {
            for (i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }


}
