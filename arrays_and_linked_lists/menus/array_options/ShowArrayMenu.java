package arrays_and_linked_lists.menus.array_options;

import arrays_and_linked_lists.menus.MenuBase;

public class ShowArrayMenu extends MenuBase {

    public void showMenu() {

        if (canClear) {
            clearConsole();
        }
        switchOption();
    }

    public void switchOption() {
        int option = inputOption(0);
    }
}
