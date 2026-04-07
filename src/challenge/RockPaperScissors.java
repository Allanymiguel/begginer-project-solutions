package challenge;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static int userScore = 0;
    static int computerScore = 0;
    static Scanner scan = new Scanner(System.in);

    static void main() {
        Random random = new Random();

        Integer user = 0;
        int computer = 0;

        String[] arr = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to our rock, paper, scissors game!\nThe options are:");

        while (true) {
            int count = 0;
            do{
                if(count >=3) break;
                user = getNumberFromUser();
                count++;
            } while(user == null);

            if(user == null) {
                System.out.println("Sorry but we can't understand you...\nWe have to finish the program.\n");
                break;
            }

            computer = random.nextInt(3);

            System.out.println("You: " + arr[user] + " vs Computer: " + arr[computer]);
            String resultPhrase = getWinner(user, computer);
            System.out.println(resultPhrase);
            updateScore(resultPhrase);
            System.out.printf("You: %d | Computer: %d\n", userScore, computerScore);

            System.out.println();
            System.out.println("Do you wanna play again? (y/n)");
            if(!scan.nextLine().equalsIgnoreCase("y")) {
                System.out.printf("And the final score is...\nYou: %d\nComputer %d\n\n", userScore, computerScore);
                break;
            }
        }
        System.out.println("Thanks for playing!");

    }

    static Integer getNumberFromUser() {
        System.out.println("1. Rock\n2. Paper\n3.Scissors");
        System.out.println("Type 1-3 and the computer will respond automatically.");
        int user = scan.nextInt() - 1;
        scan.nextLine();

        if (user > 2 || user < 0) {
            System.out.println("The number you typed must be 1, 2 or 3...");
            return null;
        }
        return user;
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
