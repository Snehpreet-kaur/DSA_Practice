package Beginner_1.Loops;
/*Factorial of any given number n is represented as n! = n * n-1 * n-2 .....* 1. Write a program
to calculate the factorial of a given number.
Note: Factorial of 0 is 1.*/
import java.util.*;
public class factorial_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
