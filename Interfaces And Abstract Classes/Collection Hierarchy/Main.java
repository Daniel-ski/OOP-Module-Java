package InterfacesAndAbstractClasses_Ex.x07_CollectionHierarchy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] itemsToAdd = scanner.nextLine().split("\\s+");
        int numberOfRemove = Integer.parseInt(scanner.nextLine());

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        StringBuilder sbForaddCollection = new StringBuilder();
        StringBuilder sbForAddRemoveCollection = new StringBuilder();
        StringBuilder sbForMyList = new StringBuilder();

        Arrays.stream(itemsToAdd).collect(Collectors.toList()).forEach(e -> {
             sbForaddCollection.append(addCollection.add(e)).append(" ");
             sbForAddRemoveCollection.append(addRemoveCollection.add(e)).append(" ");
             sbForMyList.append(myList.add(e)).append(" ");
        });

        System.out.println(sbForaddCollection.toString());
        System.out.println(sbForAddRemoveCollection.toString());
        System.out.println(sbForMyList.toString());


        StringBuilder sbForRemoveAddRemoveCollection = new StringBuilder();
        StringBuilder sbForRemoveMyList = new StringBuilder();

        Arrays.stream(itemsToAdd).collect(Collectors.toList()).forEach(e -> {

            sbForRemoveAddRemoveCollection.append(addRemoveCollection.remove()).append(" ");
            sbForRemoveMyList.append(myList.remove()).append(" ");
        });

        System.out.println(sbForRemoveAddRemoveCollection.toString());
        System.out.println(sbForRemoveMyList.toString());

    }
}
