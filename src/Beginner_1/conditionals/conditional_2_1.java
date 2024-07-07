package Beginner_1.conditionals;
/*You are required to take input of a character from the user.
The task is to print the following
1, if the character is a uppercase alphabet(A to Z)
0, if the character is a lowercase alphabet(a to z)
-1, if the character is not an alphabet*/
import java.util.*;
public class conditional_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int m = (int)ch;
        int ans;
        if (m >= 65 && m <= 90) {
            ans = 1;
        } else if (m >= 97 && m <= 122) {
            ans = 0;
        } else {
            ans = -1;
        }
        System.out.println(ans);
    }
}
