package creational.FactoryMethod;

import java.util.Scanner;

public class GameClient {
    public static void main(String args[]) {
        GameFactory gameFactory;
        Game game;
        System.out.println("Vendosni tipin e lojes qe do te luani!");
        Scanner scanner = new Scanner(System.in);
        String gameType = scanner.nextLine();

        if (gameType.equals("pc"))
            gameFactory = new PcGameFactory();
        else if (gameType.equals("board"))
            gameFactory = new BoardGameFactory();
        else
            gameFactory = null;

        if (gameFactory != null) {
            game = gameFactory.create();
            game.print();
        } else {
            System.out.println("Ju nuk keni percaktuar nje tip te sakte loje!");
        }
    }
}
