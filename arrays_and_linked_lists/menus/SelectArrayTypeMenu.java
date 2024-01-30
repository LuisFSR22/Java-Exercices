package arrays_and_linked_lists.menus;

public class SelectArrayTypeMenu extends MenuBase {

    public void showMenu() {

        clearConsole();

        System.out.println(" --------------------");
        System.out.println("|  Arrays Machine    |");
        System.out.println("|--------------------|");
        System.out.println("|  1 -> Int Array    |");
        System.out.println("|  2 -> String Array |");
        System.out.println("|  0 -> Back         |");
        System.out.println("|____________________|");

        switchOption(isInt);

    }

    public void switchOption(boolean isInt) {

        int option = inputOption(3);
        MenuInterface arrayOptionsMenu = new ArrayOptionsMenu();

        switch (option) {

            case 1:
                isInt = true;
                arrayOptionsMenu.showMenu();
                break;

            case 2:
                isInt = false;
                arrayOptionsMenu.showMenu();
                break;
                
            case 0:
                MenuInterface selectListType = new SelectListType();
                selectListType.showMenu();
                break;

            default:
                System.out.println("Invalid Option. Let's try again!");
                switchOption(isInt);
                break;
        }
    }
}
