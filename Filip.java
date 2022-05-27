// Kattis problem: https://open.kattis.com/problems/filip

import java.util.Scanner;

public class Filip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        int a = reverseNumber(input1);
        int b = reverseNumber(input2);

        System.out.println(Math.max(a, b));
    }

    public static int reverseNumber(int input) {

        int reverse = 0;

        while (input != 0) {

            int remainder = input % 10;
            reverse = reverse * 10 + remainder;
            input = input / 10;

        }
        return reverse;

        }



    }

