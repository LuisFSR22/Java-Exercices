package arrays_and_linked_lists.resources.menus.options.actions;

import arrays_and_linked_lists.resources.menus.main.Main;
import arrays_and_linked_lists.resources.menus.options.MainOptions;
import arrays_and_linked_lists.resources.menus.options.interfaces.SelectArrayTypeInterface;
import java.util.Scanner;

public class Show implements SelectArrayTypeInterface {

    public static void menuShowArraysInterface() {

        SelectArrayTypeInterface.menuInsertArraysInterface();
        switchArrayMenu();
    }

    private static void switchArrayMenu() {

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {
            case 1:
                showNumbers();
                menuShowArraysInterface();
                break;

            case 2:
                showNames();
                menuShowArraysInterface();
                break;

            case 0:
                MainOptions.menuOptionsInterface();
                break;

            default:
                switchArrayMenu();
                break;
        }
    }

    private static void showNumbers() {

        try {
            System.out.print("Numbers: ");
            for (int i = 0; i < Main.numbers.length; i++) {
                System.out.print(Main.numbers[i] + " ");

            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    private static void showNames() {

        try {
            System.out.print("Names: ");
            for (int i = 0; i < Main.names.length; i++) {
                System.out.print(Main.names[i] + " ");

            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }
}
