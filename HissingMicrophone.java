/**
 * My solution to the Hissing Microphone problem at Kattis, https://open.kattis.com/problems/hissingmicrophone
 */

import java.util.Scanner;

public class HissingMicrophone {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        String output = (input.contains("ss")) ? "hiss": "no hiss";
        System.out.println(output);

    }
}
