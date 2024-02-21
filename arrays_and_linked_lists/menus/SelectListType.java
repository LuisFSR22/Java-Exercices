package arrays_and_linked_lists.menus;

public class SelectListType extends MenuBase {

    public SelectListType() {
        nextMenu = new SelectArrayTypeMenu(this);
        previousMenu = new MainMenu();
    }

    public void showMenu() {

        clearConsole();

        System.out.println(" --------------------------");
        System.out.println("|  Arrays && Linked Lists  |");
        System.out.println("|--------------------------|");
        System.out.println("|  1 -> Arrays             |");
        System.out.println("|  2 -> Linked Lists       |");
        System.out.println("|  0 -> Back               |");
        System.out.println("|__________________________|");

        switchOption();

    }

    public void switchOption() {

        int option = inputOption(3);

        switch (option) {

            case 1:
                nextMenu.showMenu();
                break;

            case 2:

                break;
            case 0:
                mainMenu.showMenu();
                break;

            default:
                System.out.println("Invalid Option. Let's try again!");
                switchOption();
                break;
        }

    }
}
