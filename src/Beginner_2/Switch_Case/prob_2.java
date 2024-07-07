package Beginner_2.Switch_Case;
/*You are given a positive integer N. Write a program using switch case such that :
if user enters 12 , print "I am even",if user enters 13 , print "I am prime",if user enters 25 , print "I am odd",
Otherwise , print "I am just a number".*/
import java.util.*;
public class prob_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        switch(N){
            case 12:
                System.out.println("I am even");
                break;
            case 13:
                System.out.println("I am prime");
                break;
            case 25:
                System.out.println("I am odd");
                break;
            default:
                System.out.println("I am just a number");
        }
    }
}
