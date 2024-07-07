package Beginner_1.nested_loops;
/*Given an integer n that denotes the number of rows to be printed, print the pattern
in which each row starts with its corresponding alphabet and has a length equal to the
row number. (See the examples for a better understanding).Note: You can take the alphabet
to be cyclic. On reaching Z, you will cycle back to A, then B, and so on.*/
import java.util.*;
public class Character_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)m);
                m++;
            }
            System.out.println();
        }
    }
}
