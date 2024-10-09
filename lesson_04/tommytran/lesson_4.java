public class lesson_4 {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; // Numbers less than 2 are not prime
        }
        if (n == 2) {
            return true; // 2 is the only even prime number
        }
        if (n % 2 == 0) {
            return false; // Numbers divisible by 2 are not prime
        }
        // Loop that checks every odd number up to the square root of n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not prime
            }
        }
        return true; // n is prime
    }

    public static void main(String[] args) {
        // Declare integers in main method
        int a = 1;
        int b = 9;
        int c = 17;

        // Return string of whether or not int is a prime number
        System.out.println("Is " + a + " a prime number? " + isPrime(a));
        System.out.println("Is " + b + " a prime number? " + isPrime(b));
        System.out.println("Is " + c + " a prime number? " + isPrime(c));
    }
}
// code sourced from chat-gpt after converting my JS file.
