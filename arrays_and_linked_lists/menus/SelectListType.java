package arrays_and_linked_lists.menus;

public class SelectListType extends MenuBase {

    public void showMenu() {

        clearConsole();

        System.out.println(" --------------------------");
        System.out.println("|  Arrays && Linked Lists  |");
        System.out.println("|--------------------------|");
        System.out.println("|  1 -> Arrays             |");
        System.out.println("|  2 -> Linked Lists       |");
        System.out.println("|  0 -> Back               |");
        System.out.println("|__________________________|");

        switchOption(isInt);

    }

    public void switchOption(boolean isInt) {

        int option = inputOption(3);

        switch (option) {

            case 1:
                MenuInterface selectArrayTypMenuInterface = new SelectArrayTypeMenu();
                selectArrayTypMenuInterface.showMenu();
                break;

            case 2:

                break;
            case 0:
                MenuInterface mainMenu = new MainMenu();
                mainMenu.showMenu();
                break;

            default:
                System.out.println("Invalid Option. Let's try again!");
                switchOption(isInt);
                break;
        }

    }
}
