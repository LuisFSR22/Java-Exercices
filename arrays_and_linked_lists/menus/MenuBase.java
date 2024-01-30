package arrays_and_linked_lists.menus;

import java.util.Scanner;

public abstract class MenuBase implements MenuInterface {

    public boolean isInt;

    public abstract void showMenu();
    public abstract void switchOption(boolean isInt);

    public int inputOption(int maxOptions) {

        int option = -1;
        boolean notValid = true;

        while (notValid) {
            Scanner value = new Scanner(System.in);
            System.out.print("Chose an option: ");
            option = value.nextInt();

            if(option <= maxOptions && option >= 0){
                notValid = false;
            }
            else{
                System.out.println("Invalid Option!");
            }
        }
        return option;
    };

    public static void clearConsole() {
        for (int i = 0; i < 50; ++i){
           System.out.println();
       }
   }
}
