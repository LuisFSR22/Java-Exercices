package arrays_and_linked_lists.menus;

import arrays_and_linked_lists.menus.array_options.InsertArrayMenu;

public class ArrayOptionsMenu extends MenuBase {

    public ArrayOptionsMenu(MenuInterface previousMenu) {
        this.previousMenu = previousMenu;
    }

    public void showMenu() {

        clearConsole();

        System.out.println(" --------------------");
        System.out.println("|  Arrays Machine    |");
        System.out.println("|--------------------|");
        System.out.println("|  1 -> Insert Array |");
        System.out.println("|  2 -> Show Array   |");
        System.out.println("|  3 -> Edit Array   |");
        System.out.println("|  4 -> Delete Array |");
        System.out.println("|  0 -> Back         |");
        System.out.println("|____________________|");
        System.out.println("|IsInt: " + isInt);

        switchOption();
    }

    public void switchOption() {

        int option = inputOption(4);

        switch (option) {
            case 1:
                showMenuOption(new InsertArrayMenu(this));
                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 0:
                previousMenu.showMenu();
                break;

            default:
                System.out.println("Invalid Option. Let's try again!");
                showMenu();
                break;
        }
    }

    private void showMenuOption(MenuInterface menu) {
        menu.showMenu();
    }
}