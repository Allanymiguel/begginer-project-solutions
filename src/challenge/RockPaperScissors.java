package challenge;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static int userScore = 0;
    static int computerScore = 0;
    static void main() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int user;
        int computer;

        String[] arr = {"Rock", "Paper", "Scissors"};

        while (true) {
            System.out.println("Welcome to our rock, paper, scissors game!\nThe options are:");
            System.out.println("1. Rock\n2. Paper\n3.Scissors");
            System.out.println("Type 1-3 and the computer will respond automatically.");
            user = scan.nextInt();
            scan.nextLine();

            if (user > 2 || user < 0) return;
            computer = random.nextInt(3);

            System.out.println("You: " + arr[user] + " vs Computer: " + arr[computer]);
            String resultPhrase = getWinner(user, computer);
            System.out.println(resultPhrase);
            updateScore(resultPhrase);



        }
    }

    static String getWinner(int user, int computer) {
        String userPhrase = "You win";
        String computadorPhrase = "Computer wins";
        String tiePhrase = "It's a tie";

        return switch (user) {
            case 0 -> {
                if (computer == 1) yield computadorPhrase;
                else if (computer == 2) yield userPhrase;
                yield tiePhrase;
            }
            case 1 -> {
                if (computer == 0) yield userPhrase;
                else if (computer == 2) yield computadorPhrase;
                yield tiePhrase;
            }
            case 2 -> {
                if (computer == 0) yield computadorPhrase;
                else if (computer == 1) yield userPhrase;
                yield tiePhrase;
            }
            default -> null;
        };
    }

    static void updateScore(String s) {
        if(s == null) return;
        if (s.toLowerCase().contains("you")) userScore++;
        if (s.toLowerCase().contains("computer")) computerScore++;
    }
}
