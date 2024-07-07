package Beginner_1.functions;
/*Given 2 numbers n and r. Your task is to calculate nPr n!/(n-r)!.*/
import java.util.*;
public class nPr {
    public static int cal(int N) {
        int fact=1;
        for(int i=N;i>=1;i--){
            fact=fact*i;
        }
        return(fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int ans=cal(n)/cal(n-r);
        System.out.println(ans);
    }
}
