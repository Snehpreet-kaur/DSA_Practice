package Beginner_1.Loops;
/*You are given an integer N. Your task is to output the sum of all natural numbers till N.
Natural numbers are a part of the number system, including all the positive numbers from 1 to infinity.*/
import java.util.*;
public class sum_natural_nos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
