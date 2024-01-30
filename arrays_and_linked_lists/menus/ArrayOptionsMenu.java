package arrays_and_linked_lists.menus;

public class ArrayOptionsMenu extends MenuBase {

    public void showMenu() {

        clearConsole();

        System.out.println(" --------------------");
        System.out.println("|  Arrays Machine    |");
        System.out.println("|--------------------|");
        System.out.println("|  1 -> Show Array   |");
        System.out.println("|  2 -> Insert Array |");
        System.out.println("|  3 -> Edit Array   |");
        System.out.println("|  4 -> Delete Array |");
        System.out.println("|  0 -> Back         |");
        System.out.println("|____________________|");
        System.out.println("|IsInt: " + isInt);


        switchOption(isInt);
    }

    public void switchOption(boolean isInt) {

        int option = inputOption(4);

        switch (option) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 0:
                MenuInterface selectArrayTypeMenu = new SelectArrayTypeMenu();
                selectArrayTypeMenu.showMenu();
                break;

            default:
                System.out.println("Invalid Option. Let's try again!");
                showMenu();
                break;
        }

    }
}