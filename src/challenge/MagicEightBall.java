package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MagicEightBall {
    static void main() throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        List<String> answers = listOfAnswers();
        Random randomNumber = new Random();
        boolean running = true;

        while(running){
            System.out.println("What is your question?");
            scan.nextLine();

            System.out.println("Humm... thinking...\n");
            TimeUnit.SECONDS.sleep(3); //waits 3 seconds

            System.out.println(answers.get(randomNumber.nextInt(19)));
            TimeUnit.SECONDS.sleep(1);

            System.out.println("Press number 1 to ask something or any other key to quit: ");
            String option = scan.next();
            scan.nextLine();
            
            if (!option.equals("1")){
                System.out.println("Finishing application.");
                running = false;
            }

        }

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