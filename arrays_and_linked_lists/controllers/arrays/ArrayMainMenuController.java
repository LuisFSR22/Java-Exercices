package arrays_and_linked_lists.controllers.arrays;

import java.util.Scanner;

import arrays_and_linked_lists.interfaces.ClearConsoleInterface;

public class ArrayMainMenuController implements ClearConsoleInterface {

    public static int[] numbers;
    public static String[] names;
    
    public static void menuInterface() {

        ClearConsoleInterface.clearConsole();

        System.out.println(" ------------------");
        System.out.println("|  Arrays Machine  |");
        System.out.println("|------------------|");
        System.out.println("|  1 -> Start      |");
        System.out.println("|  0 -> Exit       |");
        System.out.println("|__________________|");

        switchMainMenu();
    }

    private static void switchMainMenu() {

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {
            case 1:
                System.out.println("Let's start!");
                ArrayOptionsController.menuOptionsInterface();
                break;

            case 0:
                System.out.println("Bye bye!");
                return;

            default:
                switchMainMenu();
                break;
        }
    }
}
