package arrays_and_linked_lists.controllers;

import java.util.Scanner;

import arrays_and_linked_lists.interfaces.ClearConsoleInterface;

public class CreditsCrontroller {

    public static void creditsMenuInterface() {

        ClearConsoleInterface.clearConsole();

        System.out.println(" --------------------------");
        System.out.println("|  Arrays && Linked Lists  |");
        System.out.println("|--------------------------|");
        System.out.println("|         Credits          | ");
        System.out.println("|    Project Created By:   |");
        System.out.println("|        Luís Rosa         |");
        System.out.println("|                          |");
        System.out.println("|  0 -> Exit               |");
        System.out.println("|__________________________|");

        creditsMenuOptions();
    }

    private static void creditsMenuOptions() {

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {
            case 0:
                return;

            default:
                System.out.println("Invalid Option. Let's try again!");
                creditsMenuOptions();
                break;
        }
    }

}
