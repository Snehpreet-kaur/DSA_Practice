package Beginner_2.Switch_Case;
/*You are given a positive integer N. Write a program using switch case to print the
following output such that :
If the case is 55 , print "Study is important" ,Otherwise , print "No value" .*/
import java.util.*;
public class prob_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        switch (N) {
            case 55:
                System.out.println("Study is important");
                break;
            default:
                System.out.println("No value");
        }
    }
}