package java_methods;

public class ExampleClass {
    private double number;

    // Constructor
    public ExampleClass(double number) {
        this.number = number;
    }

    // Non-static method
    public double square() {
        return this.number * this.number;
    }

    // Static method to print a message
    public static void printMessage() {
        System.out.println("This is a static method.");
    }

    // Static method to add two numbers
    public static double addNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Create an instance of ExampleClass
        ExampleClass example = new ExampleClass(5.0);

        // Call the non-static method using the instance
        double result = example.square();
        System.out.println("The square of the number is: " + result);

        // Call the static methods
        ExampleClass.printMessage();
        double sum = ExampleClass.addNumbers(3.0, 4.5);
        System.out.println("The sum of the numbers is: " + sum);
    }
}

