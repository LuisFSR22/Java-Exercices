package arrays_and_linked_lists.resources.menus.options.interfaces;

public interface ClearConsoleInterface {
    
    public static void clearConsole() {
         for (int i = 0; i < 50; ++i){
            System.out.println();
        }

    }
}
