package arrays_and_linked_lists.resources.menus.options.actions.editactions;

import java.util.Scanner;

import arrays_and_linked_lists.resources.menus.main.Main;
import arrays_and_linked_lists.resources.menus.options.interfaces.ClearConsoleInterface;
import arrays_and_linked_lists.resources.menus.options.interfaces.TitleDisplayInterface;

public class DeleteValue implements TitleDisplayInterface, ClearConsoleInterface {

    public static void deleteValueIntArrays(int[] array) {
        try {
            ClearConsoleInterface.clearConsole();
            TitleDisplayInterface.numbersTitleDisplay();

            for (int i = 0; i < array.length; i++) {
                System.out.println("| " + (i + 1) + " -> " + array[i] + " ");
            }

            int index = (selectOption() - 1);

            int newSize = array.length - 1;
            int[] newArray = new int[newSize];

            for (int i = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[i] = array[i];
                }
            }
            Main.numbers = newArray;

        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    public static void deleteValueStringArrays(String[] array) {
        try {
            ClearConsoleInterface.clearConsole();
            TitleDisplayInterface.namesTitleDisplay();

            for (int i = 0; i < array.length; i++) {
                System.out.println("| " + (i + 1) + " -> " + array[i] + " ");
            }

            int index = (selectOption() - 1);

            int newSize = array.length - 1;
            String[] newArray = new String[newSize];

            for (int i = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[i] = array[i];
                }
            }
            Main.names = newArray;


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
        System.out.print("Chose an option to delete: ");

        return value.nextInt();

    }
}
