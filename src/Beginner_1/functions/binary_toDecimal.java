package Beginner_1.functions;
/*Given binary representation of a number , convert it to decimal representation.
Note : You just need to complete binaryToDecimal function.eg-111 = 7*/
import java.util.*;
public class binary_toDecimal {
    public static void deci(int m){
        int c=0,d,e,sum=0;
        while(m!=0){
            d=m%10;
            e=d*(int)(Math.pow(2,c++));
            sum=sum+e;
            m=m/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        deci(n);
    }
}
