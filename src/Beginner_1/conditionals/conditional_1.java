package Beginner_1.conditionals;
/*You are given a number N. Write a program using If Else such
that if N is less than 30 then the output will be "less important"
otherwise the output will be "more important".*/
import java.util.*;
public class conditional_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N<=30){
            System.out.println("Less important");
        }else{
            System.out.println("More important");
        }
    }
}
