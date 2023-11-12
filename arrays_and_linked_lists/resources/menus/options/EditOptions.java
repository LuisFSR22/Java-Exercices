package arrays_and_linked_lists.resources.menus.options;

import arrays_and_linked_lists.resources.menus.main.Main;
import arrays_and_linked_lists.resources.menus.options.actions.Delete;
import arrays_and_linked_lists.resources.menus.options.actions.Insert;
import arrays_and_linked_lists.resources.menus.options.actions.Show;
import arrays_and_linked_lists.resources.menus.options.actions.editactions.EditValue;
import arrays_and_linked_lists.resources.menus.options.actions.editactions.SortArray;

import java.util.Scanner;

public class EditOptions {

    public static void menuOptionsInterface(String arrayType) {

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
                Insert.menuInsertArraysInterface();
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
