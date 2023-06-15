import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;
        String playerAMove;
        String playerBMove;

        do {
            do {
                System.out.println("Player A, enter your move (R,P,S or r,p,s):");
                playerAMove = scanner.nextLine();
            } while (!playerAMove.equalsIgnoreCase("R") && !playerAMove.equalsIgnoreCase("P") && !playerAMove.equalsIgnoreCase("S"));

            do {
                System.out.println("Player B, enter your move (R,P,S or r,p,s):");
                playerBMove = scanner.nextLine();
            } while (!playerBMove.equalsIgnoreCase("R") && !playerBMove.equalsIgnoreCase("P") && !playerBMove.equalsIgnoreCase("S"));


            if (playerAMove.equalsIgnoreCase(playerBMove)) {
                System.out.println("It's a tie!");
            } else if (playerAMove.equalsIgnoreCase("R")) {
                if (playerBMove.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                } else {
                    System.out.println("Paper covers Rock. Player B wins!");
                }
            } else if (playerAMove.equalsIgnoreCase("P")) {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock. Player A wins!");
                } else {
                    System.out.println("Scissors cuts Paper. Player B wins!");
                }
            } else {
                if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper. Player A wins!");
                } else {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                }
            }

            System.out.println("Do you want to play again? (Y/N)");
            playAgain = scanner.nextLine();

        } while (playAgain.equalsIgnoreCase("Y"));
    }
}
