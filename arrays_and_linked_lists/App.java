package arrays_and_linked_lists;

import arrays_and_linked_lists.menus.MainMenu;
import arrays_and_linked_lists.menus.MenuInterface;

public class App {
    
    public static void main(String[] args) {
        MenuInterface mainMenu = new MainMenu();
        mainMenu.showMenu();
    }
}
