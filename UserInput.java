import java.util.Scanner;
/**
 * Write a description of class UserInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInput
{
    public static String getString(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
