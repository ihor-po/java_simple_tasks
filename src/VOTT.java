import java.util.Scanner;

/**
 * Variant One Task Two
 * Создать приложение для ввода пароля из командной строки и сравнения его со строкой образцом
 */
public class VOTT {

    /**
     * Sample password
     */
    final static String passSample = "P@sSw0Rd_32#431_%@";
    /**
     * regex for password
     */
    final static String passReg = "[A-Za-z0-9_%@#.!<>]{6,}";

    /**
     * Main method
     * @param args from command line
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter your password: ");
        if (in.hasNextLine()) {
            String str = in.nextLine();
            if (!str.isEmpty()) {
                boolean res = false;
                if (!str.matches(passReg)) {
                    System.out.println("ERROR!" + System.lineSeparator() + "Your password does not match regular expressions.");
                    return;
                }
                if (str.equals(passSample) && str.hashCode() == passSample.hashCode() && str.intern() == passSample) {
                    res = true;
                }
                if (res) {
                    System.out.println("Your sample password matches.");

                } else {
                    System.out.println("ERROR!" + System.lineSeparator() + "Your password does not match the sample.");
                }
            } else {
                System.out.println("ERROR!" + System.lineSeparator() + "You did not enter the password");
            }
        } else {
            System.out.println("ERROR!" + System.lineSeparator() + "You did not enter the password");
        }
    }
}
