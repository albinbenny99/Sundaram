package ExceptionHandling;

public class ArithmeticExc {
    public static void main(String[] args) {
        // First try block for division
        try {
            int a = 10, b = 0;
            int result = a / b;  // 🚨 ArithmeticException
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }

        // Second try block for array operations
        try {
            int[] arr = new int[2];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;  // 🚨 ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println("Index out of bounds");
        }
    }
}
