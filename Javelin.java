// My solution to the problem Jumbo Javelin on Kattis webpage, https://open.kattis.com/problems/jumbojavelin

import java.util.Scanner;

public class Javelin {

        public static void main (String [] args) {

            Scanner console = new Scanner(System.in);
            int n = console.nextInt();
            int [] l = new int [n];

            int sum = 0;
            int count = 0;

            for (int i = 0; i < l.length; i++) {
                l [i] = console.nextInt();
                sum += l[i];
                count ++;
            }

            System.out.println(sum - count + 1);
        }
    }

