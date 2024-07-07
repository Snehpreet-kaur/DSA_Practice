package Beginner_1.maths;
/*You are given two positive integers. You have to calculate the result by performing +,-,*,/,% operations on them.

Input Format
The first line of input contains two space-separated integers A and B.*/
import java.util.*;
public class Math_operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println("Sum is "+(A+B)+ "\nDifference is "+(A-B)+"\nProduct is "+(A*B)+"\nQuotient is "+(A/B)
                +"\nRemainder is "+(A%B));
    }
}
