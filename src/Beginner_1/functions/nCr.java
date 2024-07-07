package Beginner_1.functions;
/*Given n and r, your task is to calculate nCr.
Here nCr is the total number of ways for selecting r elements out of
n options are nCr = (n!) / (r! * (n-r)!)  where n! = 1 * 2 * . . . * n.
eg 5 2 =10*/
import java.util.*;
public class nCr {
    public static int fact(int a) {
        int ans=1;
        for(int i=a;i>=1;i--){
           ans=ans*i;
        }
        return(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int ans=fact(n)/(fact(r) * (fact(n-r)));
        System.out.println(ans);
    }
}
