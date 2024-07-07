package Beginner_1.conditionals;

import java.util.Scanner;

/*Given the 3 sides of a triangle, find out whether it is acute-angled
, right-angled, or obtuse-angled.You need to output 1 for acute, 2
for right-angled, and 3 for an obtuse-angled triangle. You can assume
that the input values always form a triangle and are valid integers.*/

public class conditional_2_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=0,s1=0,s2=0,sum=0;
        if(a>b && a>c){
            max=a;s1=b;s2=c;
        }else if(b>a && b>c){
            max=b;s1=a;s2=c;
        }else{
            max=c;s1=a;s2=b;
        }
        sum=(int)(s1*s1)+(s2*s2);
        max=(int)(Math.pow(max,2));
        if(sum>max){
            System.out.println(1);
        }else if(sum<max){
            System.out.println(3);
        }else if(sum==max){
            System.out.println(2);
        }
    }
}
