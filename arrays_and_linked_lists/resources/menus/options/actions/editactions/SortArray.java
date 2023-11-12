package arrays_and_linked_lists.resources.menus.options.actions.editactions;

import java.util.Arrays;

public class SortArray {

    public static void sortIntArrays(int[] array) {
        try {
            Arrays.sort(array);
            System.out.println("Sorted Array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    public static void sortStringArrays(String[] array) {
        try {
            Arrays.sort(array);
            System.out.println("Sorted Array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }
}
