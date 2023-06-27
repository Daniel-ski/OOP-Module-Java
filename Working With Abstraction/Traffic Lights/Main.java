package WorkingWithAbstraction_Ex.x04_TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLight = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        List<Light> trafficLights = new ArrayList<>();

        for (String currentLightColor : inputLight) {
            Light light = new Light(Color.valueOf(currentLightColor));
            trafficLights.add(light);
        }

        for (int i = 0; i < n ; i++) {
            trafficLights.forEach(e -> {
                e.changeColor();
                System.out.print(e.getColor() + " ");
            });
            System.out.println();
        }
    }

}
