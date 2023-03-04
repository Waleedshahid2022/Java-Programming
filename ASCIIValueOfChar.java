package GeeksforGeeks;

import java.util.Scanner;

public class ASCIIValueOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to get ascii value ");
        char character = sc.next().charAt(0);
        System.out.println("The ASCII Value of the given character is  "+ (int)character);

    }
}
