package arrays_and_linked_lists.controllers;

import java.util.Scanner;

import arrays_and_linked_lists.controllers.arrays.ArrayOptionsController;
import arrays_and_linked_lists.interfaces.ClearConsoleInterface;

public class StartMenuController {

    public static void mainMenuInterface() {

        ClearConsoleInterface.clearConsole();

        System.out.println(" --------------------------");
        System.out.println("|  Arrays && Linked Lists  |");
        System.out.println("|--------------------------|");
        System.out.println("|  1 -> Start              |");
        System.out.println("|  2 -> Credits            |");
        System.out.println("|  0 -> Exit               |");
        System.out.println("|__________________________|");

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {
            case 1:
                choseArrayLinkedListsInterface();
                break;

            case 2:
                CreditsCrontroller.creditsMenuInterface();
                break;

            case 0:
                System.out.println("Bye bye!");
                return;

            default:
                System.out.println("Invalid Option. Let's try again!");
                mainMenuInterface();
                break;
        }
    }

    public static void choseArrayLinkedListsInterface() {

        ClearConsoleInterface.clearConsole();

        System.out.println(" --------------------------");
        System.out.println("|  Arrays && Linked Lists  |");
        System.out.println("|--------------------------|");
        System.out.println("|  1 -> Arrays             |");
        System.out.println("|  2 -> Linked Lists       |");
        System.out.println("|  0 -> Back               |");
        System.out.println("|__________________________|");

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {
            case 1:
                ArrayOptionsController.menuOptionsInterface();
                break;

            case 2:
                break;

            case 0:
                mainMenuInterface();
                return;

            default:
                System.out.println("Invalid Option. Let's try again!");
                choseArrayLinkedListsInterface();
                break;
        }
    }
}
