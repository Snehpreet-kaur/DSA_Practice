package Beginner_1.Loops;
/*Given two number a and b, find their HCF.
What Is HCF?
HCF or Highest Common Factor is the greatest common divisor between two numbers.*/
import java.util.*;
public class hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=0,val=0;
        if(a>b){
            val=a;
        }else{
            val=b;
        }
        for(int i=1;i<val;i++){
            if(a%i==0 && b%i==0){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
