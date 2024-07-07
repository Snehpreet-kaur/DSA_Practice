package Beginner_2.String;
/*A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a
pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.*/
import java.util.*;
public class Pangrams{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = str.length();
        int count = 0;
        char ch, ch1;
        str = str.toLowerCase();
        for (int j = 97; j <= 122; j++) {
            ch1 = (char) j;
            for (int i = 0; i < l; i++) {
                ch = str.charAt(i);
                if (ch == ch1) {
                    count++;
                    i = l + 1;
                }
            }
        }
        if (count == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
