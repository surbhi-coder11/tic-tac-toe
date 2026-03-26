import board.Board;
import player.Player;
import game.Game;
import java.util.*;

public class hello {
    public static void main(String args[]) {

        Board b = new Board(3);
        b.printBoardConfig();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name of player 1");
        String name1 = sc.nextLine();
        System.out.println("enter char of player1");
        char symbol1 = sc.nextLine().charAt(0);
        Player p1 = new Player();
        p1.setDetails(name1, 19, "Uttar Pradesh", 9639805579, "surbhigupta.g19@gmail.com",
                symbol1);
        // p1.seNameSymbol(name1, symbol1);
        p1.getDetails();

        System.out.println("enter name of player 2");
        String name2 = sc.nextLine();
        System.out.println("enter char of player2");
        char symbol2 = sc.nextLine().charAt(0);
        Player p2 = new Player();
        p2.setDetails(name2, 19, "Uttar Pradesh", 9639805579, "surbhigupta.g19@gmail.com",
                symbol2);
        // p1.seNameSymbol(name1, symbol1);
        p2.getDetails();

        Game game = new Game(new Player[] { p1, p2 }, b);
        game.play();
    }
}
