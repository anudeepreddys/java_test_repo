import java.util.Random;
import java.util.Scanner;

public class Problem_3 {

    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    public static void main(String args[])
    {
        System.out.println("Enter player move:");
        String playerMove = getPlayermove();
        String computerMove = getComputerMove();

        //The Rules Applied are
        //if the players and computers moves match then the result would be tie
        switch (playerMove) {
            case "ROCK":
                switch (computerMove) {
                    case "SCISSORS":
                        System.out.println("Player wins");
                        break;
                    case "PAPER":
                        System.out.println("Computer Wins");
                        break;
                    case "ROCK":
                        System.out.println("Game is Tie !!");
                        break;
                }
                break;
            case "PAPER":
                switch (computerMove) {
                    case "ROCK":
                        System.out.println("Player wins");
                        break;
                    case "SCISSORS":
                        System.out.println("Computer Wins");
                        break;
                    case "PAPER":
                        System.out.println("Game is Tie !!");
                        break;
                }
                break;
            case "SCISSORS":
                switch (computerMove) {
                    case "PAPER":
                        System.out.println("Player wins");
                        break;
                    case "ROCK":
                        System.out.println("Computer Wins");
                        break;
                    case "SCISSORS":
                        System.out.println("Game is Tie !!");
                        break;
                }
                break;
        }
    }
    // Method for generation of random moves for computer //
    public static String getComputerMove()
    {
        String computermove;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        if (input == 1)
            computermove = Problem_3.ROCK;
        else if(input == 2)
            computermove = Problem_3.PAPER;
        else
            computermove = Problem_3.SCISSORS;

        System.out.println("Computer move is: " + computermove);
        System.out.println();
        return computermove;
    }
    // Scanning the user input for the generation of players move//
    public static String getPlayermove()
    {
        String playermove;
        Scanner in = new Scanner(System.in);
        int pinput = in.nextInt();
        if (pinput == 1)
            playermove = Problem_3.ROCK;
        else if(pinput == 2)
            playermove = Problem_3.PAPER;
        else
            playermove = Problem_3.SCISSORS;
        System.out.println("Player move is: "+ playermove);
        return playermove;
    }
}