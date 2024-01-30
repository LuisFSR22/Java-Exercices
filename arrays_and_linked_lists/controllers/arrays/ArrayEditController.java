package arrays_and_linked_lists.controllers.arrays;

import java.util.Arrays;
import java.util.Scanner;

import arrays_and_linked_lists.interfaces.ClearConsoleInterface;
import arrays_and_linked_lists.interfaces.TitleDisplayInterface;

public class ArrayEditController implements ClearConsoleInterface {

    public static void menuOptionsInterface(String arrayType) {

        ClearConsoleInterface.clearConsole();

        System.out.println(" --------------------");
        System.out.println("|  Arrays Machine    |");
        System.out.println("|--------------------|");
        System.out.println("|  1 -> Edit Value   |");
        System.out.println("|  2 -> Add Value    |");
        System.out.println("|  3 -> Delete Value |");
        System.out.println("|  4 -> Sort Array   |");
        System.out.println("|  0 -> Back         |");
        System.out.println("|____________________|");

        switchOptionMenu(arrayType);
    }

    // Switch Array Menu Option //

    private static void switchOptionMenu(String arrayType) {

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option: ");
        int option = value.nextInt();

        switch (option) {

            case 1:
                if (arrayType == "int") {
                    editIntArrays(ArrayMainMenuController.numbers);
                }

                else if (arrayType == "string") {
                    editStringArrays(ArrayMainMenuController.names);
                }
                menuOptionsInterface(arrayType);
                break;

            case 2:
                if (arrayType == "int") {
                    insertIntValueArrays(ArrayMainMenuController.numbers);
                }

                else if (arrayType == "string") {
                    insertStringValueArrays(ArrayMainMenuController.names);
                }
                menuOptionsInterface(arrayType);
                break;

            case 3:
                if (arrayType == "int") {
                    deleteValueIntArrays(ArrayMainMenuController.numbers);
                }

                else if (arrayType == "string") {
                    deleteValueStringArrays(ArrayMainMenuController.names);
                }
                menuOptionsInterface(arrayType);
                break;

            case 4:

                if (arrayType == "int") {
                    sortIntArrays(ArrayMainMenuController.numbers);
                }

                else if (arrayType == "string") {
                    sortStringArrays(ArrayMainMenuController.names);
                }
                menuOptionsInterface(arrayType);
                break;

            case 0:
                ArrayOptionsController.menuOptionsInterface();
                break;

            default:
                switchOptionMenu(arrayType);
                break;
        }
    }

    // Edit Values Array Values //

    public static void editIntArrays(int[] array) {
        try {
            ClearConsoleInterface.clearConsole();
            TitleDisplayInterface.numbersTitleDisplay();

            for (int i = 0; i < array.length; i++) {
                System.out.println("| " + (i + 1) + " -> " + array[i] + " ");
            }

            int index = (selectOption() - 1);

            Scanner value = new Scanner(System.in);
            System.out.print("Type a number: ");
            array[index] = value.nextInt();

            System.out.println("New number: " + array[index]);

        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    public static void editStringArrays(String[] array) {
        try {
            ClearConsoleInterface.clearConsole();
            TitleDisplayInterface.namesTitleDisplay();

            for (int i = 0; i < array.length; i++) {
                System.out.println("| " + (i + 1) + " -> " + array[i] + " ");
            }

            int index = (selectOption() - 1);

            Scanner value = new Scanner(System.in);
            System.out.print("Type a name: ");
            array[index] = value.nextLine();

            System.out.println("New name: " + array[index]);
        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    // Insert Values Into Array //

    public static void insertIntValueArrays(int[] array) {
        try {
            ClearConsoleInterface.clearConsole();
            TitleDisplayInterface.numbersTitleDisplay();

            Scanner value = new Scanner(System.in);
            System.out.print("Type a number: ");
            int newNumber = value.nextInt();

            int newSize = array.length + 1;
            int[] newArray = new int[newSize];

            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[newSize - 1] = newNumber;
            ArrayMainMenuController.numbers = newArray;

        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    public static void insertStringValueArrays(String[] array) {
        try {
            TitleDisplayInterface.namesTitleDisplay();

            Scanner value = new Scanner(System.in);
            System.out.print("Type a name: ");
            String newName = value.nextLine();

            int newSize = array.length + 1;
            String[] newArray = new String[newSize];

            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }

            newArray[newSize - 1] = newName;
            ArrayMainMenuController.names = newArray;

        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    // Delete Values From Array //
    public static void deleteValueIntArrays(int[] array) {
        try {
            ClearConsoleInterface.clearConsole();
            TitleDisplayInterface.numbersTitleDisplay();

            for (int i = 0; i < array.length; i++) {
                System.out.println("| " + (i + 1) + " -> " + array[i] + " ");
            }

            int index = (selectOption() - 1);

            int newSize = array.length - 1;
            int[] newArray = new int[newSize];

            for (int i = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[i] = array[i];
                }
            }
            ArrayMainMenuController.numbers = newArray;

        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    public static void deleteValueStringArrays(String[] array) {
        try {
            ClearConsoleInterface.clearConsole();
            TitleDisplayInterface.namesTitleDisplay();

            for (int i = 0; i < array.length; i++) {
                System.out.println("| " + (i + 1) + " -> " + array[i] + " ");
            }

            int index = (selectOption() - 1);

            int newSize = array.length - 1;
            String[] newArray = new String[newSize];

            for (int i = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[i] = array[i];
                }
            }
            ArrayMainMenuController.names = newArray;

            System.out.println("New name: " + array[index]);
        } catch (Exception e) {
            System.out.println("Array is empty");
        }
    }

    // Sort Array //
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

    public static int selectOption() {

        System.out.println("|-------------------|");
        System.out.println("| 0 -> Cancel       |");
        System.out.println("|-------------------|");

        Scanner value = new Scanner(System.in);
        System.out.print("Chose an option to delete: ");

        return value.nextInt();

    }
}
