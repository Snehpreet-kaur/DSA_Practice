package Beginner_1.Loops;
/*Two numbers are entered through the keyboard. Write a program to find the value of one number raised
to the power of another. (Do not use Java or C++ built-in function)*/
import java.util.*;
public class power_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mul=1;
        for(int i=1;i<=b;i++){
            mul=mul*a;
        }
        System.out.println(mul);
    }
}
