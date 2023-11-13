package arrays_and_linked_lists.resources.menus.options.actions;

import arrays_and_linked_lists.resources.menus.options.MainOptions;
import arrays_and_linked_lists.resources.menus.options.EditOptions;
import arrays_and_linked_lists.resources.menus.options.interfaces.ClearConsoleInterface;
import arrays_and_linked_lists.resources.menus.options.interfaces.SelectArrayTypeInterface;
import java.util.Scanner;

public class Edit implements SelectArrayTypeInterface {

    public static void menuEditArraysInterface() {

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
                EditOptions.menuOptionsInterface("int");
                break;

            case 2:
                EditOptions.menuOptionsInterface("string");
                break;

            case 0:
                MainOptions.menuOptionsInterface();
                break;

            default:
                switchArrayMenu();
                break;
        }
    }
}
