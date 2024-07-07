package Beginner_1.Loops;
/*Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
For example, if the input is 12345, the output should be 54321.
Note: Input number will not have any trailing zeros.*/
import java.util.*;
public class reverse_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d,n1=0;
        while(n!=0){
            d=n%10;
            n1=n1*10+d;
            n=n/10;
        }
        System.out.println(n1);
    }
}
