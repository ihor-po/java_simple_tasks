import java.util.Arrays;

/**
 * Variant One Task Three
 * Создать программу ввода целых чисел как аргументов командной строки, подсчета их
 * суммы (произведения) и вывода результата на консоль
 */
public class VOTTH {
    /**
     * Main method
     * @param args from command line
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            int sum, mult;

            sum = sumArgs(args);
            mult = multiplicationArgs(args);

            System.out.println("The sum is: " + sum + System.lineSeparator());
            System.out.println("The multiplication is: " + mult + System.lineSeparator());
        } else {
            System.out.println("ERROR!" + System.lineSeparator() + "You forgot the arguments");
        }
    }

    /**
     * The sum of arguments
     * @param args arguments
     * @return the sum
     */
    private static int sumArgs(String[] args) {
        int res = 0;
        for(String arg:args) {
            try
            {
                res += Integer.parseInt(arg);
            }
            catch (Exception ex) {
                System.out.println("ERROR!" + System.lineSeparator() + "Your argument is not an INTEGER");
            }
        }
        return res;
    }

    /**
     * The multiplication of arguments
     * @param args arguments
     * @return the multiplication
     */
    private static int multiplicationArgs(String[] args) {
        int res = 1;
        for(String arg:args) {
            try
            {
                res *= Integer.parseInt(arg);
            }
            catch (Exception ex) {
                System.out.println("ERROR!" + System.lineSeparator() + "Your argument is not an INTEGER");
            }
        }
        return res;
    }
}
