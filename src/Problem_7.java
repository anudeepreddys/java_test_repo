import java.util.Random;
public class Problem_7 {
    public static void main(String args[]) {
        Random rand = new Random();
        // Generation of Random 3-Letter string
        String str = (char) (65 + rand.nextInt(26)) +""+ (char) (65 + rand.nextInt(26)) + (char) (65 + rand.nextInt(26));
        // Generation of Random 4-digit number
        int number = 1000 + rand.nextInt(8999);
        // Printing the Random Number plate generated
        System.out.println(str + "" + number);
    }
}