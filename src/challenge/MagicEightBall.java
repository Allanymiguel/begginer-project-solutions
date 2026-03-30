package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MagicEightBall {
    static void main() {

        Scanner scan = new Scanner(System.in);
        List<String> answers = listOfAnswers();
        Random randomNumber = new Random();

        System.out.println("What is your question?");
        String question = scan.nextLine();

        System.out.println(answers.get(randomNumber.nextInt(19)));

        scan.close();

    }

    // simulates another file with all the questions added
    public static List<String> listOfAnswers() {
        List<String> ans = new ArrayList<>();
        ans.add("It is certain.");
        ans.add("Reply hazy, try again.");
        ans.add("It is decidedly so.");
        ans.add("It is certain.");
        ans.add("Most likely.");
        ans.add("Concentrate and ask again.");
        ans.add("As I see it, yes.");
        ans.add("My reply is no.");
        ans.add("Without a doubt.");
        ans.add("Yes definitely.");
        ans.add("Ask again later.");
        ans.add("Yes.");
        ans.add("My source says no.");
        ans.add("Cannot predict now.");
        ans.add("Sign points to yes.");
        ans.add("Outlook not so good.");
        ans.add("Better not tell you now...");
        ans.add("You may not rely on it.");
        ans.add("Very doubtful.");
        ans.add("Don't count on it.");

        return ans;
    }

}