package Beginner_1.functions;
/*Lily wants to enter a positive integer and increase its value by 5
using for loop.She wants to increase the value in fun function & print
 the result in the caller function.Help Lily by writing a program for
 the same.*/
import java.util.*;
public class problem_3 {
    public static int fun(int n) {
        for(int i=1;i<=5;i++){
            n++;
        }
        return(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=fun(n);
        System.out.println(m);
    }
}
