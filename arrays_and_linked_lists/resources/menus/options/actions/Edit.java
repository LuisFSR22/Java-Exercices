package arrays_and_linked_lists.resources.menus.options.actions;

import arrays_and_linked_lists.resources.menus.options.MainOptions;
import arrays_and_linked_lists.resources.menus.options.EditOptions;
import arrays_and_linked_lists.resources.menus.options.interfaces.SelectArrayTypeInterface;
import java.util.Scanner;

public class Edit implements SelectArrayTypeInterface {

    private static EditOptions editOptions;

    public static void menuEditArraysInterface() {

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
            System.out.println("You entered: " + myArray[i]);
        }
        return myArray;
    }

    private static String[] stringArrays() {
        String myArray[] = new String[arrayLimit()];

        for (int i = 0; i < myArray.length; i++) {
            Scanner value = new Scanner(System.in);
            System.out.print("Enter a name: ");
            myArray[i] = value.nextLine();
            System.out.println("You entered: " + myArray[i]);
        }
        return myArray;
    }

}
