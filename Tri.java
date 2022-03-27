// My solution to the Tri problem on Kattis webpage: https://open.kattis.com/problems/tri

import java.util.Scanner;

public class Tri {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a + b) == c) {
            System.out.println(a + "+" + b + "=" + c);
        }
        else if (a == (b+c)) {
            System.out.println(a + "=" + b + "+" + c);
        }
        else if (a == (b-c)) {
            System.out.println(a + "=" + b + "-" + c);
        }

        else if ((a - b) == c) {
            System.out.println(a + "-" + b + "=" + c);
        }
        else if ((a - c) == c) {
            System.out.println(a + "-" + b + "=" + c);
        }

        else if ((a * b) == c) {
            System.out.println(a + "*" + b + "=" + c);
        }
        else if (a == (b * c)) {
            System.out.println(a + "=" + b + "*" + c);
        }

        else if (a == (b / c) && (b % c == 0)) {
            System.out.println(a + "=" + b + "/" + c);
        }
        else if ((a / b) == c && (a % b == 0)) {
            System.out.println(a + "/" + b + "="+ c);
        }
    }
}
