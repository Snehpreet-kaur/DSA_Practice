package Beginner_1.nested_loops;
/*Given an integer n, print all prime numbers between 1 and n (both inclusive).*/
import java.util.*;
public class optimus_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1,c=0;
        for(int i=2;i<=n;i++){
            n1=i;
            c=0;
            for(int j=1;j<=n1;j++){
                if(n1%j==0){
                    c++;
                }
            }
            if(c==2){
                System.out.println(i);
            }
        }
    }
}
