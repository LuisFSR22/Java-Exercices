package arrays_and_linked_lists.resources.menus.options.actions;

import arrays_and_linked_lists.resources.menus.main.Main;
import arrays_and_linked_lists.resources.menus.options.MainOptions;
import arrays_and_linked_lists.resources.menus.options.interfaces.ClearConsoleInterface;
import arrays_and_linked_lists.resources.menus.options.interfaces.SelectArrayTypeInterface;
import java.util.Scanner;

public class Insert implements SelectArrayTypeInterface {

    public static void menuInsertArraysInterface() {
    
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
                Main.numbers = intArrays();
                menuInsertArraysInterface();
                break;

            case 2:
                Main.names = stringArrays();
                menuInsertArraysInterface();
                break;

            case 0:
                MainOptions.menuOptionsInterface();
                break;

            default:
                switchArrayMenu();
                break;
        }
    }

    private static int arrayLimit() {

        Scanner value = new Scanner(System.in);
        System.out.print("Enter the array limit: ");
        int limit = value.nextInt();

        return limit;
    }

    private static int[] intArrays() {

        int myArray[] = new int[arrayLimit()];

        for (int i = 0; i < myArray.length; i++) {
            Scanner value = new Scanner(System.in);
            System.out.print("Enter a number: ");
            myArray[i] = value.nextInt();
        }
        return myArray;
    }

    private static String[] stringArrays() {
        String myArray[] = new String[arrayLimit()];

        for (int i = 0; i < myArray.length; i++) {
            Scanner value = new Scanner(System.in);
            System.out.print("Enter a name: ");
            myArray[i] = value.nextLine();
        }
        return myArray;
    }

}
