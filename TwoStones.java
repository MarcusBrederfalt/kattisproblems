import java.util.Scanner;

// My solution to Kattis problem Two Stones: https://open.kattis.com/problems/twostones

public class TwoStones {

    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         int stones = input.nextInt();

         if (stones % 2 != 0) {
             System.out.println("Alice");
         }
         else {
             System.out.println("Bob");
         }

    }
}
