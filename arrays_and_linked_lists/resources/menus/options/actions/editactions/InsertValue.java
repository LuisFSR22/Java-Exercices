package arrays_and_linked_lists.resources.menus.options.actions.editactions;

import java.util.Scanner;

import arrays_and_linked_lists.resources.menus.main.Main;
import arrays_and_linked_lists.resources.menus.options.interfaces.ClearConsoleInterface;
import arrays_and_linked_lists.resources.menus.options.interfaces.TitleDisplayInterface;

public class InsertValue implements TitleDisplayInterface, ClearConsoleInterface{

    public static void insertIntValueArrays(int[] array) {
        try {
            ClearConsoleInterface.clearConsole();
            TitleDisplayInterface.numbersTitleDisplay();

            Scanner value = new Scanner(System.in);
            System.out.print("Type a number: ");
            int newNumber = value.nextInt();

            int newSize = array.length + 1;
            int[] newArray = new int[newSize];

            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[newSize - 1] = newNumber;
            Main.numbers = newArray;

        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    public static void insertStringValueArrays(String[] array) {
        try {
            TitleDisplayInterface.namesTitleDisplay();

            Scanner value = new Scanner(System.in);
            System.out.print("Type a name: ");
            String newName = value.nextLine();

            int newSize = array.length + 1;
            String[] newArray = new String[newSize];

            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }

            newArray[newSize - 1] = newName;
            Main.names = newArray;

        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }
}
