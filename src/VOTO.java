import java.util.Arrays;

/**
 * Variant One Task One
 * Создать приложение, которое отображает в окне консоли аргументы командной строки
 * метода main() в обратном порядке.
 */
public class VOTO {
    /**
     * Main method
     * @param args from command line
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("You did not enter any arguments at startup!");
        } else {
            reverseArray(args);
            System.out.println(Arrays.toString(args));
        }

    }

    /**
     * Сopy elements from the end of args to the start newArr
     * @param arr array to reverce
     */
    private static void reverseArray(String[] arr){
        String[] newArr = new String[arr.length];                               //create new array
        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            newArr[j] = arr[i];                                                 //copy elements from the end of args to the start newArr
        }
        System.arraycopy(newArr, 0, arr, 0, newArr.length);     //rewrite arr
    }
}
