package arrays_and_linked_lists.resources.menus.options;

import arrays_and_linked_lists.resources.menus.main.Main;
import arrays_and_linked_lists.resources.menus.options.actions.Delete;
import arrays_and_linked_lists.resources.menus.options.actions.Insert;
import arrays_and_linked_lists.resources.menus.options.actions.Show;
import arrays_and_linked_lists.resources.menus.options.actions.Edit;

import java.util.Scanner;

public class MainOptions {

    public static void menuOptionsInterface() {

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
                Show.menuShowArraysInterface();
                break;

            case 2:
                Insert.menuInsertArraysInterface();
                break;

            case 3:
                Edit.menuEditArraysInterface();
                break;

            case 4:
                Delete.menuDeleteArraysInterface();
                break;

            case 0:
                Main.menuInterface();
                break;

            default:
                switchOptionMenu();
                break;
        }
    }
}
