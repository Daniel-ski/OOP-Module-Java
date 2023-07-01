package Encapsulation_Ex.x03_ShoppingSpree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] personData = scanner.nextLine().split(";");
        for (String currentPerson : personData) {
            String name = currentPerson.split("=")[0];
            double money = Double.parseDouble(currentPerson.split("=")[1]);

            Person person = new Person(name,money);
        }

        String[] productData = scanner.nextLine().split(";");
        for (String currentProduct : productData) {
            String name = currentProduct.split("=")[0];
            double cost = Double.parseDouble(currentProduct.split("=")[1]);

            Product product = new Product(name,cost);
        }

        String command = scanner.nextLine();

        while (!command.equals("END")){
            String personName = command.split("\\s+")[0];
            String productName = command.split("\\s+")[1];



            command = scanner.nextLine();
        }
    }
}
