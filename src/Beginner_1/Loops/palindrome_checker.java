package Beginner_1.Loops;
/*Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be
 Palindrome when it reads the same from backwards as forward.*/
import java.util.*;
public class palindrome_checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1,n2,d;
        n1=n;n2=0;
        while(n!=0){
            d=n%10;
            n2=n2*10+d;
            n=n/10;
        }
        if(n1==n2){
            System.out.println("It is a Palindrome number");
        }else{
            System.out.println("It is not a Palindrome number");
        }
    }
}
