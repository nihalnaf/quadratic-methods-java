import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String end;
        System.out.println("A second-degree polynomial is of the form f(x) = ax^2 + bx + c");
        do {
            //ask user for inputs for values of second-degree polynomial
            System.out.println("Enter the values of your polynomial below.");
            System.out.print("Enter the value for a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter the value for b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter the value for c: ");
            double c = scanner.nextDouble();
            //create an object of type Quadratic using values collected from user
            Quadratic quadratic = new Quadratic(a, b, c);
            //display the object quadratic in string form
            System.out.println("\nYour second-degree polynomial is: " + quadratic);
            //create an array of the options that the user can select from
            String[] options = {"Roots", "Derivative", "Integral", "Find f(x) given x", "Find x given f(x)"};
            //print all 5 options using a for loop and index of the list of options
            for(int i = 1; i < options.length + 1; i++) {
                System.out.println(i + ". " + options[i - 1]);
            }
            int choice;
            //do-while loop so that it keeps asking user to select option if their option is out of bounds
            do {
                //collect input for user choice
                System.out.print("Enter option (1-5): ");
                choice = scanner.nextInt();
            } while(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);
            //decision structure for which method to execute and display results depending on user choice
            switch(choice) {
                case 1:
                    quadratic.roots();
                    break;
                case 2:
                    System.out.println(quadratic.derivative());
                    break;
                case 3:
                    System.out.println(quadratic.integral());
                    break;
                case 4:
                    System.out.print("Enter the value for x: ");
                    double x = scanner.nextDouble();
                    System.out.println("f(" + x + ") = " + quadratic.solveForY(x));
                    break;
                case 5:
                    System.out.print("Enter the value for f(x): ");
                    double y = scanner.nextDouble();
                    quadratic.solveForX(y);
                    break;
            }
            System.out.print("Would you like to continue? Enter 'Q' or 'q' to quit: ");
            //ask user if they want to quit
            end = scanner.next();
        } while(!end.equalsIgnoreCase("q"));

    }
}
