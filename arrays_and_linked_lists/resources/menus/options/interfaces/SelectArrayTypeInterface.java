package arrays_and_linked_lists.resources.menus.options.interfaces;

import java.util.Scanner;

import arrays_and_linked_lists.resources.menus.main.Main;
import arrays_and_linked_lists.resources.menus.options.MainOptions;

public interface SelectArrayTypeInterface {
    
    public static void menuInsertArraysInterface() {

        System.out.println(" --------------------");
        System.out.println("|  Arrays Machine    |");
        System.out.println("|--------------------|");
        System.out.println("|  1 -> Int Array    |");
        System.out.println("|  2 -> String Array |");
        System.out.println("|  0 -> Back         |");
        System.out.println("|____________________|");

    }
}