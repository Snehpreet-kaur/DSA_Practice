package Beginner_1.nested_loops;
/*You are given two numbers m and n, you are required to print all the Armstrong Numbers between
m and n (both inclusive).Armstrong Numbers are numbers those have the sum of their own digits
 raised to the power number of digits equals the number itself. Eg. 153 = 13 + 53 + 33, so 153
 is an Armstrong number.*/
import java.util.*;
public class Armstrong_no_inRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int min=0,max=0,n1=0,d,d1,sum=0,c=0,n2=0;
        if(m>n){
            min=n;
            max=m;
        }else{
            min=m;
            max=n;
        }
        for(int i=min;i<=max;i++){
            n1=i;
            n2=i;
            while(n2!=0){
                c++;
                n2=n2/10;
            }
            while(n1!=0){
                d=n1%10;
                d1=(int)(Math.pow(d,c));
                sum=sum+d1;
                n1=n1/10;
            }
            if(sum==i){
                System.out.println(sum);
            }
            sum=0;c=0;
        }
    }
}
