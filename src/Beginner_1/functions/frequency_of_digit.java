package Beginner_1.functions;
/*You are given a number n and a digit d.
You are required to calculate the frequency of the digit d
 in the number n.Note:- Don't change the Function Definition in
 the solution Class just return the frequency to the main
 function and the main function prints the frequency.*/
import java.util.*;
public class frequency_of_digit {
    public static int soln(int no,int di) {
        int c=0,d;
        while(no!=0){
            d=no%10;
            if(di==d){
                c++;
            }
            no=no/10;
        }
        return(c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int ans=soln(n,d);
        System.out.println("Frequency is : "+ans);
    }
}
