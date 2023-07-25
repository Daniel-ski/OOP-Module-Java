package InterfacesAndAbstractClasses_Ex.x04_FoodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Buyer> personsData = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0 ){
            String[] currentPerson = scanner.nextLine().split("\\s+");
            String name = currentPerson[0];
            int age = Integer.parseInt(currentPerson[1]);

            if (currentPerson.length <= 3){
                String group = currentPerson[2];

                Rebel rebel = new Rebel(name,age,group);
                personsData.put(name,rebel);
            }else {
                String id = currentPerson[2];
                String birthData = currentPerson[2];

                Citizen citizen = new Citizen(name,age,id,birthData);
                personsData.put(name,citizen);
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String name = command;

            if (personsData.containsKey(name)){
               personsData.get(name).buyFood();
            }

            command = scanner.nextLine();
        }

        System.out.println(personsData.values()
                .stream()
                .map(Buyer::getFood)
                .reduce(0, Integer::sum));

    }
}
