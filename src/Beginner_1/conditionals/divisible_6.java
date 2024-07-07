package Beginner_1.conditionals;
/*Given a number n, If the number is divisible by 6
 then print Divisible else Not divisible.*/
import java.util.*;
public class divisible_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%6==0){
            System.out.println("Divisible by 6");
        }else{
            System.out.println("Not Divisible");
        }
    }
}
