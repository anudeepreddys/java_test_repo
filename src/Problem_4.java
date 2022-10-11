import java.util.Scanner;
public class Problem_4 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.format("Please enter a 4-digit number:");
        // User input for a number that is to be  checked whether a palindrome or not
        int input = s.nextInt();
        int x = 0;
        int temp = input;
        while (temp > 0) {
            x = x * 10 + temp % 10;
            temp = temp/10;
        }
        // checking if the given string is a palindrome or not
        if (x == input)
            System.out.format("%d is a palindrome", input);
        else
            System.out.format("%d is not a palindrome", input);
    }
}