package arrays_and_linked_lists.menus;

public class SelectArrayTypeMenu extends MenuBase {

    public SelectArrayTypeMenu(MenuInterface previousMenu){
        nextMenu =  new ArrayOptionsMenu(this);
        this.previousMenu = previousMenu;
    }

    public void showMenu() {

        clearConsole();

        System.out.println(" --------------------");
        System.out.println("|  Arrays Machine    |");
        System.out.println("|--------------------|");
        System.out.println("|  1 -> Int Array    |");
        System.out.println("|  2 -> String Array |");
        System.out.println("|  0 -> Back         |");
        System.out.println("|____________________|");

        switchOption();

    }

    public void switchOption() {

        int option = inputOption(3);
        
        switch (option) {

            case 1:
                isInt = true;
                nextMenu.showMenu();
                break;

            case 2:
                isInt = false;
                nextMenu.showMenu();
                break;
                
            case 0:
                previousMenu.showMenu();
                break;

            default:
                System.out.println("Invalid Option. Let's try again!");
                switchOption();
                break;
        }
    }
}
