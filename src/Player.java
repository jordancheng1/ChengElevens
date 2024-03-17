import java.util.Scanner;
import java.util.ArrayList;

public class Player {
    public static void main(String[] args) {
        ElevensBoard game = new ElevensBoard();
        Scanner scan = new Scanner(System.in);
        while (game.anotherPlayIsPossible()) {
            ArrayList<Integer> selectedCards = new ArrayList<>();
            ArrayList<String> selectedCardsStr = new ArrayList<>();
            System.out.println("0     1     2      3      4     5     6     7     8");
            for (int i = 0; i < game.size(); i++) {
                System.out.print(game.cardAt(i).rank() + game.cardAt(i).suit() + "    ");
            }
            System.out.print("Enter two or three cards to remove (ex. 1 10 or J Q K ): ");
            String playerChoice = scan.nextLine();
            if (playerChoice.substring(0, 1).equals("J") || playerChoice.substring(0, 1).equals("Q") || playerChoice.substring(0, 1).equals("K")) {
                for (int i = 0; i < playerChoice.length(); i++) {
                    if (playerChoice.substring(i, i + 1).equals("J") || playerChoice.substring(i, i + 1).equals("Q") || playerChoice.substring(i, i + 1).equals("K")) {
                        selectedCardsStr.add(playerChoice.substring(i, i + 1));
                    }
                }
                game.isLegal(selectedCardsStr);
            }
            else {
                int idx = 0;
                selectedCards.add(Integer.parseInt(playerChoice.substring(0, playerChoice.indexOf(" "))));
                idx = playerChoice.indexOf(" " + 1);
                selectedCards.add(Integer.parseInt(playerChoice.substring(idx)));
                }
            }
        }
    }
}