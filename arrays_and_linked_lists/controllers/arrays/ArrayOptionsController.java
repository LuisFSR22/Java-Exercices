package arrays_and_linked_lists.controllers.arrays;

import java.util.Scanner;

import arrays_and_linked_lists.controllers.StartMenuController;
import arrays_and_linked_lists.interfaces.ClearConsoleInterface;
import arrays_and_linked_lists.interfaces.SelectArrayTypeInterface;
import arrays_and_linked_lists.interfaces.TitleDisplayInterface;

public class ArrayOptionsController implements ClearConsoleInterface {

    private static boolean canClear = true;

    public static void menuOptionsInterface() {

        ClearConsoleInterface.clearConsole();

        System.out.println(" --------------------");
        System.out.println("|  Arrays Machine    |");
        System.out.println("|--------------------|");
        System.out.println("|  1 -> Show Array   |");
        System.out.println("|  2 -> Insert Array |");
        System.out.println("|  3 -> Edit Array   |");
        System.out.println("|  4 -> Delete Array |");
        System.out.println("|  0 -> Back         |");
        System.out.println("|____________________|");

        switchOptionMenu();
    }

    private static void switchOptionMenu() {

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {

            case 1:
                showArrayOption();
                break;

            case 2:
                insertArrayOption();
                break;

            case 3:
                editArrayOption();
                break;

            case 4:
                deleteArrayOption();
                break;

            case 0:
                StartMenuController.choseArrayLinkedListsInterface();
                break;

            default:
                switchOptionMenu();
                break;
        }
    }

    // Show Arrays //
    public static void showArrayOption() {

        if (canClear) {
            ClearConsoleInterface.clearConsole();
        }

        SelectArrayTypeInterface.menuInsertArraysInterface();

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {
            case 1:
                canClear = false;
                ClearConsoleInterface.clearConsole();
                showNumbers();
                showArrayOption();
                break;

            case 2:
                canClear = false;
                ClearConsoleInterface.clearConsole();
                showNames();
                showArrayOption();
                break;

            case 0:
                canClear = true;
                ArrayOptionsController.menuOptionsInterface();
                break;

            default:
                showArrayOption();
                break;
        }
    }

    private static void showNumbers() {

        try {

            TitleDisplayInterface.numbersTitleDisplay();

            for (int i = 0; i < ArrayMainMenuController.numbers.length; i++) {
                System.out.println("| " + (i + 1) + " -> " + ArrayMainMenuController.numbers[i] + " ");
            }

        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    private static void showNames() {

        try {

            TitleDisplayInterface.namesTitleDisplay();

            for (int i = 0; i < ArrayMainMenuController.names.length; i++) {
                System.out.println("| " + (i + 1) + " -> " + ArrayMainMenuController.names[i] + " ");
            }

        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    public static void insertArrayOption() {

        ClearConsoleInterface.clearConsole();
        SelectArrayTypeInterface.menuInsertArraysInterface();

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {
            case 1:
                ArrayMainMenuController.numbers = intArrays();
                insertArrayOption();
                break;

            case 2:
                ArrayMainMenuController.names = stringArrays();
                insertArrayOption();
                break;

            case 0:
                ArrayOptionsController.menuOptionsInterface();
                break;

            default:
                insertArrayOption();
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

    // Edit Array Option //

    public static void editArrayOption() {

        ClearConsoleInterface.clearConsole();
        SelectArrayTypeInterface.menuInsertArraysInterface();

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {
            case 1:
                ArrayEditController.menuOptionsInterface("int");
                break;

            case 2:
                ArrayEditController.menuOptionsInterface("string");
                break;

            case 0:
                ArrayOptionsController.menuOptionsInterface();
                break;

            default:
                editArrayOption();
                break;
        }
    }

    // Delete Array Values //

    public static void deleteArrayOption() {

        ClearConsoleInterface.clearConsole();
        SelectArrayTypeInterface.menuInsertArraysInterface();

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {
            case 1:
                deleteNumbers();
                deleteArrayOption();
                break;

            case 2:
                deleteNames();
                deleteArrayOption();
                break;

            case 0:
                ArrayOptionsController.menuOptionsInterface();
                break;

            default:
                deleteArrayOption();
                break;
        }
    }

    private static void deleteNumbers() {

        try {
            int value = deleteMessage();

            switch (value) {
                case 1:
                    ArrayMainMenuController.numbers = null;
                    break;

                default:
                    deleteArrayOption();
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
                    ArrayMainMenuController.names = null;
                    break;

                default:
                    deleteArrayOption();
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
