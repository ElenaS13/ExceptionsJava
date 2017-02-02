import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by mac on 2/1/17.
 */
public class Main {
    public static void main(String[] args) {
        int x = getIntEAFP();

        System.out.println("x is "+ x);




}
    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        try {
            return s.nextInt();

        } catch (InputMismatchException e) {
            return 0;
        }


    }
}