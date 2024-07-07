package Beginner_1.Loops;
/*You are given a number N. Print sum of all even numbers from 1 to N.*/
import java.util.*;
public class even_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,i;
        for(i=2;i<=n;i+=2){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}