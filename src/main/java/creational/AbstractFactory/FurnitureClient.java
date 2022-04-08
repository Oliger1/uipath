package creational.AbstractFactory;

import java.util.Scanner;

public class FurnitureClient {
    public static void main(String[] args) {
        System.out.println("Vendosni tipin e mobiljeve qe doni!");
        Scanner scanner = new Scanner(System.in);
        String chairType = scanner.nextLine();
        FurnitureFactory furnitureFactory = new FactoryProvider().createFactory(chairType);
        if (furnitureFactory != null) {
            var chair = furnitureFactory.createChair();
            chair.print();

            var table = furnitureFactory.createTable();
            table.print();
        }

    }
}
