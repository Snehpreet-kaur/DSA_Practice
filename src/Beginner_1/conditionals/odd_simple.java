package Beginner_1.conditionals;
/*You are given two integers a and b. You need to perform the following operations
If both integers are odd, print `we are odd`.
Else print `we are simple`.*/
import java.util.*;
public class odd_simple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a%2!=0 && b%2!=0){
            System.out.println("We are odd");
        }else{
            System.out.println("We are simple");
        }
    }
}
