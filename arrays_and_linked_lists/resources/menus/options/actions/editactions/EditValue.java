package arrays_and_linked_lists.resources.menus.options.actions.editactions;

import java.util.Scanner;

import arrays_and_linked_lists.resources.menus.options.interfaces.ClearConsoleInterface;
import arrays_and_linked_lists.resources.menus.options.interfaces.TitleDisplayInterface;

public class EditValue implements TitleDisplayInterface, ClearConsoleInterface {

    public static void editIntArrays(int[] array) {
        try {
            ClearConsoleInterface.clearConsole();
            TitleDisplayInterface.numbersTitleDisplay();

            for (int i = 0; i < array.length; i++) {
                System.out.println("| " + (i + 1) + " -> " + array[i] + " ");
            }

            int index = (selectOption() - 1);

            Scanner value = new Scanner(System.in);
            System.out.print("Type a number: ");
            array[index] = value.nextInt();

            System.out.println("New number: " + array[index]);

        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    public static void editStringArrays(String[] array) {
        try {
            ClearConsoleInterface.clearConsole();
            TitleDisplayInterface.namesTitleDisplay();

            for (int i = 0; i < array.length; i++) {
                System.out.println("| " + (i + 1) + " -> " + array[i] + " ");
            }

            int index = (selectOption() - 1);

            Scanner value = new Scanner(System.in);
            System.out.print("Type a name: ");
            array[index] = value.nextLine();

            System.out.println("New name: " + array[index]);
        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    public static int selectOption() {

        System.out.println("|-------------------|");
        System.out.println("| 0 -> Cancel       |");
        System.out.println("|-------------------|");

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option to edit: ");

        return value.nextInt();

    }
}
