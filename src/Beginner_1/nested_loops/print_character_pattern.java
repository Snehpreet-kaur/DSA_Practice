package Beginner_1.nested_loops;
/*You are given a number N. Print a pattern consisting of N rows, where the first row has 1 A,
 the second row has 2 Bs, and so on for N letters. Check the examples for a better understanding.
 eg n=3
 A
 BB
 CCC*/
import java.util.*;
public class print_character_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int m=65;
        for(int i=0;i<n;i++){
            char ch=(char)m;
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
            m++;
        }
    }
}
