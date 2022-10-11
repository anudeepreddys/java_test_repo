import java.util.Scanner;

public class Problem_6 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter:");
        // User entry for Alphabet or Symbol
        String str = input.nextLine();
        char first_character = str.charAt(0);
        // Switch case for checking whether the input is uppercase or lowercase of A, B, C
        switch (first_character) {
            case 'A':
            case 'B':
            case 'C':
            case 'a':
            case 'b':
            case 'c':
                System.out.println("The corresponding number is: 2");
                break;
            case 'D':
            case 'E':
            case 'F':
            case 'd':
            case 'e':
            case 'f':
                System.out.println("The corresponding number is: 3");
                break;
            case 'G':
            case 'H':
            case 'I':
            case 'g':
            case 'h':
            case 'i':
                System.out.println("The corresponding number is: 4");
                break;
            case 'J':
            case 'K':
            case 'L':
            case 'j':
            case 'k':
            case 'l':
                System.out.println("The corresponding number is: 5");
                break;
            case 'M':
            case 'N':
            case 'O':
            case 'm':
            case 'n':
            case 'o':
                System.out.println("The corresponding number is: 6");
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'p':
            case 'q':
            case 'r':
            case 's':
                System.out.println("The corresponding number is: 7");
                break;
            case 'T':
            case 'U':
            case 'V':
            case 't':
            case 'u':
            case 'v':
                System.out.println("The corresponding number is: 8");
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("The corresponding number is: 9");
                break;
            // Default case when characters other than uppercase and lowercase alphabets are given.
            default:
                System.out.println(first_character +" is invalid input");
                break;
        }
    }
}