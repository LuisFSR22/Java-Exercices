package arrays_and_linked_lists.resources.menus.options;

import arrays_and_linked_lists.resources.menus.main.Main;
import arrays_and_linked_lists.resources.menus.options.actions.editactions.InsertValue;
import arrays_and_linked_lists.resources.menus.options.actions.editactions.DeleteValue;
import arrays_and_linked_lists.resources.menus.options.actions.editactions.EditValue;
import arrays_and_linked_lists.resources.menus.options.actions.editactions.SortArray;
import arrays_and_linked_lists.resources.menus.options.interfaces.ClearConsoleInterface;

import java.util.Scanner;

public class EditOptions implements ClearConsoleInterface{

    public static void menuOptionsInterface(String arrayType) {

        ClearConsoleInterface.clearConsole();

        System.out.println(" --------------------");
        System.out.println("|  Arrays Machine    |");
        System.out.println("|--------------------|");
        System.out.println("|  1 -> Edit Value   |");
        System.out.println("|  2 -> Add Value    |");
        System.out.println("|  3 -> Delete Value |");
        System.out.println("|  4 -> Sort Array   |");
        System.out.println("|  0 -> Back         |");
        System.out.println("|____________________|");

        switchOptionMenu(arrayType);
    }

    private static void switchOptionMenu(String arrayType) {

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {

            case 1:
                if (arrayType == "int") {
                    EditValue.editIntArrays(Main.numbers);
                }

                else if (arrayType == "string") {
                    EditValue.editStringArrays(Main.names);
                }
                menuOptionsInterface(arrayType);
                break;

            case 2:
                if (arrayType == "int") {
                    InsertValue.insertIntValueArrays(Main.numbers);
                }

                else if (arrayType == "string") {
                    InsertValue.insertStringValueArrays(Main.names);
                }
                menuOptionsInterface(arrayType);
                break;

            case 3:
                if (arrayType == "int") {
                    DeleteValue.deleteValueIntArrays(Main.numbers);
                }

                else if (arrayType == "string") {
                    DeleteValue.deleteValueStringArrays(Main.names);
                }
                menuOptionsInterface(arrayType);
                break;

            case 4:

                if (arrayType == "int") {
                    SortArray.sortIntArrays(Main.numbers);
                }

                else if (arrayType == "string") {
                    SortArray.sortStringArrays(Main.names);
                }
                menuOptionsInterface(arrayType);
                break;

            case 0:
                MainOptions.menuOptionsInterface();
                break;

            default:
                switchOptionMenu(arrayType);
                break;
        }
    }
}
