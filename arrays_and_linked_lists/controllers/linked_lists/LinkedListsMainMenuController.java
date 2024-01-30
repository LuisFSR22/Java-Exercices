package arrays_and_linked_lists.controllers.linked_lists;

import java.util.Scanner;

import arrays_and_linked_lists.interfaces.ClearConsoleInterface;

public class LinkedListsMainMenuController {
    
    public class Main implements ClearConsoleInterface {

    public static int[] numbers;
    public static String[] names;
    
    public static void menuInterface() {

        ClearConsoleInterface.clearConsole();

        System.out.println(" ------------------------");
        System.out.println("|  Linked Lists Machine  |");
        System.out.println("|------------------------|");
        System.out.println("|  1 -> Start            |");
        System.out.println("|  0 -> Exit             |");
        System.out.println("|________________________|");

        switchMainMenu();
    }

    private static void switchMainMenu() {

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {
            case 1:
                System.out.println("Let's start!");
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
}
