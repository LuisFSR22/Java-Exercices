package arrays_and_linked_lists.menus;

public class MainMenu extends MenuBase {

    public void showMenu() {

        clearConsole();

        System.out.println(" --------------------------");
        System.out.println("|  Arrays && Linked Lists  |");
        System.out.println("|--------------------------|");
        System.out.println("|  1 -> Start              |");
        System.out.println("|  2 -> Credits            |");
        System.out.println("|  0 -> Exit               |");
        System.out.println("|__________________________|");

        switchOption();
    }

    public void switchOption() {

        int option = inputOption(3);

        switch (option) {
            case 1:
                MenuInterface selectListType = new SelectListType();
                selectListType.showMenu();
                break;

            case 2:
                MenuInterface creditsMenu = new CreditsMenu();
                creditsMenu.showMenu();
                break;

            case 0:
                System.out.println("Bye bye!");
                return;

            default:
                System.out.println("Invalid Option. Let's try again!");
                showMenu();
                break;
        }
    }
}
