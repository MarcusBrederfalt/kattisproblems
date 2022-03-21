import java.util.Scanner;

// My solution to the Finding An A problem on Kattis, https://open.kattis.com/problems/findingana

public class FindingAnA {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int control = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                control += i;
                break;

            }
        }

        System.out.println(word.substring(control));
    }
}
