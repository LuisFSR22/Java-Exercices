package arrays_and_linked_lists.menus;

import java.util.Scanner;

public abstract class MenuBase implements MenuInterface {

    protected static boolean isInt;
    protected static boolean canClear;
    protected static MenuInterface mainMenu;

    protected MenuInterface nextMenu;
    protected MenuInterface previousMenu;

    public abstract void showMenu();
    public abstract void switchOption();

    public int inputOption(int maxOptions) {

        int option = -1;
        boolean notValid = true;

        while (notValid) {
            Scanner value = new Scanner(System.in);
            System.out.print("Chose an option: ");
            option = value.nextInt();

            if (option <= maxOptions && option >= 0) {
                notValid = false;
            } else {
                System.out.println("Invalid Option!");
            }
        }
        return option;
    };

    public void clearConsole() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
    }

    public static void setMenu(MenuInterface menuType) {
        mainMenu = menuType;
    }

    public MenuInterface getNextMenu() {
        return nextMenu;
    }

    public void setNextMenu(MenuInterface nextMenu) {
        this.nextMenu = nextMenu;
    }

    public MenuInterface getPreviousMenu() {
        return previousMenu;
    }

    public void setPreviousMenu(MenuInterface previousMenu) {
        this.previousMenu = previousMenu;
    }
}
