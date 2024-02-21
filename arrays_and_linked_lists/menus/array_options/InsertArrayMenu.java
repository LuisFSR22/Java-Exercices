package arrays_and_linked_lists.menus.array_options;

import arrays_and_linked_lists.controllers.arrays.ArrayOptionsController;
import arrays_and_linked_lists.menus.MenuBase;
import arrays_and_linked_lists.menus.MenuInterface;

public class InsertArrayMenu extends MenuBase {

    public InsertArrayMenu(MenuInterface previousMenu) {
        this.previousMenu = previousMenu;
    }

    public void showMenu() {

        clearConsole();

        System.out.println(" --------------------");
        System.out.println("|   Arrays Machine   |");
        System.out.println("|--------------------|");
        System.out.println("|  1 -> Insert Data  |");
        System.out.println("|  0 -> Cancel       |");
        System.out.println("|____________________|");

        switchOption();
    }

    public void switchOption() {

        int option = inputOption(1);

        switch (option) {
            case 1:
                insertOption();
                break;

            case 0:
                previousMenu.showMenu();
                return;

            default:
                System.out.println("Invalid Option. Let's try again!");
                showMenu();
                break;
        }
    }

    public void insertOption() {
        if (isInt) {
            ArrayOptionsController.intArrays();
        } else {
            ArrayOptionsController.stringArrays();
        }
        this.previousMenu.showMenu();
    }
}
