import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        String lineDivider = "============================================================";
        System.out.println("Round and round and round she goes!");
        System.out.println("Where she stops, nobody knows!");
        System.out.println(lineDivider);
        System.out.println("Please pick a number between 1 and 10!");
        System.out.println(lineDivider);

        int turnsRemaining = 3;
        int actualNumber = 7;
        while (turnsRemaining > 0) {
            int guessedNumber = inputScanner.nextInt();
            inputScanner.nextLine();
            if (guessedNumber == actualNumber) {
                System.out.println();
                System.out.println(lineDivider);
                System.out.println("¸,ø¤º°`°º¤ø,¸ You win! ¸,ø¤º°`°º¤ø,¸");
                System.out.println(lineDivider);
                System.exit(0);
            }
            switch (guessedNumber) {
                case 0:
                    System.out.println();
                    System.out.println(lineDivider);
                    System.out.println("Remember:");
                    System.out.println("Choose an integer value between 1 and 10, then press Enter!");
                    System.out.println(lineDivider);
                    break;
                case -1:
                    System.out.println();
                    System.out.println(lineDivider);
                    System.out.println("Well, that's my ride. See 'ya later!");
                    System.out.println(lineDivider);
                    System.exit(0);
                default:
                    System.out.println("Better luck next time!");
                    break;
            }

        }

    }
}