public class Calculator {
    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 25;
        
        // Calling the method
        int result = addNumbers(num1, num2);

        // Displaying the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
