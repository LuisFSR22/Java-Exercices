package arrays_and_linked_lists.resources.menus.options.actions;

import arrays_and_linked_lists.resources.menus.main.Main;
import arrays_and_linked_lists.resources.menus.options.MainOptions;
import arrays_and_linked_lists.resources.menus.options.interfaces.ClearConsoleInterface;
import arrays_and_linked_lists.resources.menus.options.interfaces.SelectArrayTypeInterface;
import java.util.Scanner;

public class Delete implements SelectArrayTypeInterface {

    public static void menuDeleteArraysInterface() {

        ClearConsoleInterface.clearConsole();
        SelectArrayTypeInterface.menuInsertArraysInterface();
        switchArrayMenu();
    }

    private static void switchArrayMenu() {

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {
            case 1:
                deleteNumbers();
                menuDeleteArraysInterface();
                break;

            case 2:
                deleteNames();
                menuDeleteArraysInterface();
                break;

            case 0:
                MainOptions.menuOptionsInterface();
                break;

            default:
                switchArrayMenu();
                break;
        }
    }

    private static void deleteNumbers() {

        try {
            int value = deleteMessage();

            switch (value) {
                case 1:
                    Main.numbers = null;
                    break;

                default:
                    switchArrayMenu();
                    break;
            }

        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    private static void deleteNames() {

        try {
            int value = deleteMessage();

            switch (value) {
                case 1:
                    Main.names = null;
                    break;

                default:
                    switchArrayMenu();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    private static int deleteMessage() {

        Scanner value = new Scanner(System.in);
        System.out.println("Do you want to delete this array?");
        System.out.println(" --------------------");
        System.out.println("| 1 -> Yes | 2 -> No |");
        System.out.println("|____________________|");
        System.out.print("Chose an option: ");
        return value.nextInt();
    }
}
