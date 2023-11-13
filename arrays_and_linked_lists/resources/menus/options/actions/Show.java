package arrays_and_linked_lists.resources.menus.options.actions;

import arrays_and_linked_lists.resources.menus.main.Main;
import arrays_and_linked_lists.resources.menus.options.MainOptions;
import arrays_and_linked_lists.resources.menus.options.interfaces.ClearConsoleInterface;
import arrays_and_linked_lists.resources.menus.options.interfaces.SelectArrayTypeInterface;
import arrays_and_linked_lists.resources.menus.options.interfaces.TitleDisplayInterface;

import java.util.Scanner;

public class Show implements SelectArrayTypeInterface {

    private static boolean canClear = true;

    public static void menuShowArraysInterface() {

        if (canClear) {
            ClearConsoleInterface.clearConsole();
        }

        SelectArrayTypeInterface.menuInsertArraysInterface();
        switchArrayMenu();
    }

    private static void switchArrayMenu() {

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {
            case 1:
                canClear = false;
                ClearConsoleInterface.clearConsole();
                showNumbers();
                menuShowArraysInterface();
                break;

            case 2:
                canClear = false;
                ClearConsoleInterface.clearConsole();
                showNames();
                menuShowArraysInterface();
                break;

            case 0:
                canClear = true;
                MainOptions.menuOptionsInterface();
                break;

            default:
                switchArrayMenu();
                break;
        }
    }

    private static void showNumbers() {

        try {

            TitleDisplayInterface.numbersTitleDisplay();

            for (int i = 0; i < Main.numbers.length; i++) {
                System.out.println("| " + (i + 1) + " -> " + Main.numbers[i] + " ");
            }

        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    private static void showNames() {

        try {

            TitleDisplayInterface.namesTitleDisplay();

            for (int i = 0; i < Main.names.length; i++) {
                System.out.println("| " + (i + 1) + " -> " + Main.names[i] + " ");
            }
  
        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }
}
