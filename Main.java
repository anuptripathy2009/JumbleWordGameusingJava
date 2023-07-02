import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int gameWallet = 0;
        Scanner sc = new Scanner(System.in);
        Words w = new Words();
        String[] generated_words = {w.getWord(), w.getWord(), w.getWord(), w.getWord(), w.getWord()};
        System.out.println("╭────────────────────────────╮");
        System.out.println("│       Welcome to our       │");
        System.out.println("│           Game!            │");
        System.out.println("╰────────────────────────────╯");
        System.out.println("If you correctly guess 3 out of 5 words, you will win a reward of 50 coins..");

        int points = 0; //setting initial value of game points to be 0
        while (true) {
            System.out.println("|Requests| : |play game('y'/'n[to quit]')| |check game wallet (cw)| |nfw : 1243234|");
            String request = sc.nextLine(); //'y' or 'n'
            if (Objects.equals(request, "y")) {
                for (int i = 0; i <= generated_words.length - 1; i++) {
                    String jumb_word = w.jumbled(generated_words[i]);

                    if (Objects.equals(jumb_word, generated_words[i])) {
                        jumb_word = w.jumbled(generated_words[i]);
                    }


                    System.out.println("Word : " + jumb_word);
                    System.out.println("Guess the correct word:- ");
                    String user_word = sc.nextLine();
                    if (Objects.equals(user_word, generated_words[i])) {
                        points ++;
                    }
                }

                for (int i = 0; i <= generated_words.length - 1; i++) {
                    generated_words[i] = w.getWord();
                }



                if (points >=3) {
                    System.out.println("Wow!!! You won a reward of 50 coins");
                    gameWallet += 50;
                }

                else {
                    System.out.println("Sorry you lost!!!!");
                }

            }

            else if (Objects.equals(request, "cw")) {
                System.out.println("Current Amount In Your Game Wallet : " + gameWallet + "gc");
            }

            else {
                break;
            }
        }
        System.out.println("Bye Bye and have a nice day!!!!!");
    }
}