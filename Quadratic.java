public class Quadratic {
    //declare variables that will be used in each method
    static double a;
    static double b;
    static double c;
    //constructor that creates second-degree polynomial with given coefficient values
    public Quadratic(double first, double second, double third) {

        a = first;
        b = second;
        c = third;

    }
    //define string method for Quadratic class
    public String toString() {
        //this is what a Quadratic object looks like in string format
        return "f(x) = " + a + "x^2 + " + b + "x + " + c;

    }
    //define roots method for Quadratic class
    public void roots() {
        //#decision structure that determines how to calculate the roots as negative value inside radical means imaginary roots, equal 0 means one real root, and positive means two real roots
        double radicalContents = (Math.pow(b, 2) - 4 * a * c);
        if(radicalContents > 0) {
            double firstRoot = ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double secondRoot = ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.println("x = (" + firstRoot + ", " + secondRoot + ")");
        }
        else if(radicalContents == 0) {
            if (b == 0) {
                System.out.println("x = " + 0);
            } else {
                System.out.println("x = " + ((-b) / (2 * a)));
            }
        }
        else {
            System.out.println("There are no real roots.");
        }

    }
    //define derivative method for Quadratic class
    public String derivative() {

        return "f'(x) = " + a * 2 + "x + " + b;

    }
    //define integral method for Quadratic class
    public String integral() {

        return "F(x) = " + a / 3 + "x^3 + " + b / 2 + "x^2 + " + c + "x + C";

    }
    //define solveForY method for Quadratic class
    public double solveForY(double x) {

        return (a * (Math.pow(x, 2))) + (b * x) + c;

    }
    //define solveForX method for Quadratic class
    public void solveForX(double y) {
        //decision structure similar to roots method
        double radicalContents = (Math.pow(b, 2) - 4 * a * (c - y));
        if(radicalContents > 0) {
            double firstSolution = ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * (c - y))) / (2 * a);
            double secondSolution = ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * (c - y))) / (2 * a);
            System.out.println("x = (" + firstSolution + ", " + secondSolution + ")");
        }
        else if(radicalContents == 0) {
            if (b == 0) {
                System.out.println("x = " + 0);
            } else {
                System.out.println("x = " + ((-b) / (2 * a)));
            }
        }
        else {
            System.out.println("There are no real solutions.");
        }

    }

}
