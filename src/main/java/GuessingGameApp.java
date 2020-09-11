import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        String lineDivider = "\n============================================================";
        System.out.println("\n\n\n\n");
        System.out.println(lineDivider + lineDivider +
                "\n\n           'Round and 'round and 'round she goes." +
                "\n               Where she stops, nobody knows!\n" +
                lineDivider +
                "\nPlease pick a number between 1 and 10!" +
                "\n-1 to exit" +
                "\n0 to see these instructions again" +
                lineDivider);

        int triesRemaining = 2;
        int actualNumber = 7;
        while (triesRemaining > 0) {
            int guessedNumber = inputScanner.nextInt();
            inputScanner.nextLine();
            if (guessedNumber == actualNumber) {
                System.out.println(lineDivider +
                        "\n,ø¤º°`°º¤ø,¸¸,ø¤º°`°º¤ø,¸ You win! ¸,ø¤º°`°º¤ø,¸¸,ø¤º°`°º¤ø," +
                        lineDivider);
                System.exit(0);
            }
            switch (guessedNumber) {
                case 0:
                    System.out.println(lineDivider +
                            "\nRemember: " +
                            "\nChoose an integer value between 1 and 10, then press Enter!" +
                            "\n-1 to exit" +
                            "\n0 to see these instructions again" +
                            lineDivider);
                    break;
                case -1:
                    System.out.println(lineDivider +
                            "\nWell, that's my ride. See 'ya later!" +
                            lineDivider);
                    System.exit(0);
                default:
                    if (guessedNumber > actualNumber){
                        System.out.println("Your number is too high.");
                    } else {
                        System.out.println("Your number is too low.");
                    }
                    if (triesRemaining == 1) {
                        System.out.println("Better luck next time!");
                    } else {
                        System.out.println("Try again!");
                    }
                    triesRemaining -= 1;
                    break;
            }

        }

    }
}