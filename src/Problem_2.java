import java.util.Random;
import java.util.Scanner;
public class Problem_2 {
    public static String ROCK = "ROCK";
    public static String PAPER = "PAPER";
    public static String SCISSORS = "SCISSORS";

    public static void main(String args[])
    {
        System.out.println("Enter player move:  ");
        String playerMove = getPlayerMove();
        String computerMove = getComputerMove();
        //The Rules Applied are
        //if the players and computers moves match then the result would be tie
        if (playerMove.equals(computerMove))
            System.out.println("Game is Tie !!");
            // playerMove is ROCK
        else if (playerMove.equals(Problem_2.ROCK))
            System.out.println(computerMove.equals(Problem_2.PAPER) ? "Computer Wins": "Player wins");
            //playerMove is PAPER
        else if (playerMove.equals(Problem_2.PAPER))
            System.out.println(computerMove.equals(Problem_2.SCISSORS) ? "Computer Wins": "Player wins");
            //playerMove is SCISSORS
        else
            System.out.println(computerMove.equals(Problem_2.ROCK) ? "Computer Wins": "Player wins");
    }

    // Method for generation of random moves for computer //
    public static String getComputerMove()
    {
        String computermove;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        if (input == 1)
            computermove = Problem_2.ROCK;
        else if(input == 2)
            computermove = Problem_2.PAPER;
        else
            computermove = Problem_2.SCISSORS;

        System.out.println("Computer move is: " + computermove);
        System.out.println();
        return computermove;
    }

    // Scanning the user input for the generation of players move//
    public static String getPlayerMove()
    {
        String playermove;
        Scanner in = new Scanner(System.in);
        int pinput = in.nextInt();
        if (pinput == 1)
            playermove = Problem_2.ROCK;
        else if(pinput == 2)
            playermove = Problem_2.PAPER;
        else
            playermove = Problem_2.SCISSORS;
        System.out.println("Player move is: "+ playermove);
        return playermove;
    }


}