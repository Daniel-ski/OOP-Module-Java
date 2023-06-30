package Encapsulation_Ex.x01_Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        Box box = new Box(length,width,height);

        System.out.printf("Surface Area - %.2f%n",box.calculateLateralSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f%n",box.calculateSurfaceArea());
        System.out.printf("Volume – %.2f",box.calculateVolume());
    }
}
