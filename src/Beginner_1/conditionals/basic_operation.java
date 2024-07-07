package Beginner_1.conditionals;
/*You are given two positive integers. You have to
calculate the result by performing +,-,*,/,% operations on them.*/
import java.util.*;
public class basic_operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,sum,diff,quo,rem,pro;
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        if(a>b){
            diff=a-b;
        }else{
            diff=b-a;
        }
        pro=a*b;
        quo=a/b;
        rem=a%b;
        System.out.print("Sum is: "+sum+"\n"+"Difference is: "+diff+"\n");
        System.out.print("Quotient is: "+quo+"\n"+"Remainder is: "+rem+"\n"+"Product is: "+pro);
    }
}
