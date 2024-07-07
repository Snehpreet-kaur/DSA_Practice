package Beginner_1.conditionals;
/*Given an integer n. Your task is to write a program to use
 switch case as follows :
if the input number is 28, print i am young.
else print i am not young.*/
import java.util.*;
public class switch_case_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n) {
            case 28:
            {
                System.out.println("I am young");
                break;
            }
            default:
                System.out.println("I am not young");
        }
    }
}
