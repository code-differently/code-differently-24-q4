import java.util.Scanner; //This allows us to use the scanner to take in user input
public class findPrimeNum {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in); //A scanner named 'objScanner'
        boolean isConditionMet = false; 

        /*if the condition is met, the print statement within the loop will be printed. 
        If not, the print statement after the loop will be printed*/

        System.out.print("Please enter a whole number: "); //User input prompt
        double userInput = objScanner.nextDouble(); //This reads an integer value from the user

        /*to determine a number's primality, we can check to see if the division 
        of that number by 2 to (1 - that number) results in any whole number quotients.
        Once we do the division we can compare that number to (int) number to see if the
        values are equal.*/

        /*the program should end if A: the first whole number quotient is found, indicating that
         * indicating a number is not prime or if B: no whole number quotients are found within the
         * range indicating the number IS prime.*/
        
         for (int i = 2; i < userInput; i++) {
            if ((userInput / i) == (int) (userInput / i)) {
                System.out.println(userInput + " is not a prime number.");
                isConditionMet = true;
                break; //this helps jump out of the loop once this first whole number quotient instace is found
            }
        } if (!isConditionMet) {
            System.out.println(userInput + " is a prime number.");
        }
    }
}