package Beginner_1.Loops;
/*You are given a number. Your task is to find the sum of all the digits in the number.*/
import java.util.*;
public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,d;
        while(n!=0){
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.println(sum);
    }
}
