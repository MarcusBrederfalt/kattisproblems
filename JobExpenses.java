// My solution to the problem Job Expenses on Kattis website, https://open.kattis.com/problems/jobexpenses

import java.util.Scanner;

public class JobExpenses {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int amountOfInputValues = input.nextInt();
        int values [] = new int[amountOfInputValues];
        int totalSum = 0;

        for (int i = 0; i < amountOfInputValues; i++) {
            values[i] = input.nextInt();

            if (values[i] < 0) {
                totalSum += Math.abs(values[i]);
            }
        }

        System.out.println(totalSum);
        }
}




