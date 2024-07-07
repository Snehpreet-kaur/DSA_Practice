package Beginner_2.Switch_Case;
/*Write a program using switch cases in which two positive integers a and b will be taken as inputs.
If (a%b) is 0 then output will be "Remainder is too small",If (a%b) is 1 then output will be "Remainder is small",
If (a%b) is 2 then output will be "Remainder is large",In any other cases output will be "Remainder is too large".*/
import java.util.*;
public class prob_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int div=a%b;
        switch(div){
            case 0:
                System.out.println("Remainder is too small");
                break;
            case 1:
                System.out.println("Remainder is small");
                break;
            case 2:
                System.out.println("Remainder is large");
                break;
            default:
                System.out.println("Remainder is too large");
        }
    }
}
