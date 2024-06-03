//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth;
        System.out.println("What is your birth month?");
        birthMonth = in.nextInt();
        if (1 <= birthMonth) {
            if (birthMonth <= 12){
                System.out.println("Your birth month is " + birthMonth);
            }
            else {
                System.out.println("You entered an invalid birth month: " + birthMonth);
            }
        }
        else {
            System.out.println("You entered an invalid birth month: " + birthMonth);
        }
    }
}