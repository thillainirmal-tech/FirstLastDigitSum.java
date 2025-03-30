public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;  // Get the last digit
        while (number >= 10) {
            number /= 10;  // Remove digits until only the first digit remains
        }

        int firstDigit = number;  // The remaining digit is the first digit
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Test cases:");
        System.out.println("Sum of first and last digit of 252: " + sumFirstAndLastDigit(252));    // Output: 4 (2 + 2)
        System.out.println("Sum of first and last digit of 257: " + sumFirstAndLastDigit(257));    // Output: 9 (2 + 7)
        System.out.println("Sum of first and last digit of 0: " + sumFirstAndLastDigit(0));        // Output: 0 (0 + 0)
        System.out.println("Sum of first and last digit of 5: " + sumFirstAndLastDigit(5));        // Output: 10 (5 + 5)
        System.out.println("Sum of first and last digit of -10: " + sumFirstAndLastDigit(-10));    // Output: -1 (invalid)
        System.out.println("Sum of first and last digit of 12345: " + sumFirstAndLastDigit(12345));// Output: 6 (1 + 5)
    }
}
