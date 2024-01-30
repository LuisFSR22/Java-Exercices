package arrays_and_linked_lists.menus;

public class CreditsMenu extends MenuBase{

    public void showMenu() {

        clearConsole();

        System.out.println(" --------------------------");
        System.out.println("|  Arrays && Linked Lists  |");
        System.out.println("|--------------------------|");
        System.out.println("|         Credits          | ");
        System.out.println("|    Project Created By:   |");
        System.out.println("|        Luís Rosa         |");
        System.out.println("|                          |");
        System.out.println("|  0 -> Exit               |");
        System.out.println("|__________________________|");

        switchOption(isInt);
    }

    public void switchOption(boolean isInt) {

        int option = inputOption(3);

        switch (option) {
            case 0:
                MenuInterface mainMenu = new MainMenu();
                mainMenu.showMenu();
                return;

            default:
                System.out.println("Invalid Option. Let's try again!");
                showMenu();
                break;
        }

    }

}
