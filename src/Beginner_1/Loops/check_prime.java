package Beginner_1.Loops;
/*Write a program that inputs a positive integer N. It should then output a message indicating whether the number
 is a prime number or not.*/
import java.util.*;
public class check_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }
    }
}
