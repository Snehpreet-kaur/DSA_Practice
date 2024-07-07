package Beginner_1.functions;
/*Write a program in which user will enter two positive integers and
those two integers will be passed to another function fun.The fun
function will perform the addition of the two and will print the output.
Note that, output will be printed inside fun function.*/
import java.util.*;
public class problem_2 {
    public static void fun(int m,int n){
        int sum;
        sum=m+n;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        fun(a,b);
    }
}
