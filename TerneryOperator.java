package GeeksforGeeks;

import java.util.Scanner;

public class TerneryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers to Find The Greater Number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maxNumber = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("The Maximum Number Amoung The Given Numbers Is "+maxNumber );

    }
}
