/**
 * My solution to Reverse problem, https://open.kattis.com/problems/ofugsnuid
 */


import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int amountOfNumbers = Integer.parseInt(input.nextLine());


        int [] numbersList = new int[amountOfNumbers];

        for (int i = 0; i < amountOfNumbers; i++) {
            int theNumbers = Integer.parseInt(input.nextLine());
            numbersList[i] += theNumbers;
        }

        for (int i = numbersList.length -1; i>= 0; i--) {
            System.out.println(numbersList[i]);
        }


    }
}
