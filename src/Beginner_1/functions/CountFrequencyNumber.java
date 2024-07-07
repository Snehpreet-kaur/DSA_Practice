package Beginner_1.functions;
/*Given a number N and a digit D. Write a program to find
how many times the digit D appears in the number N.*/
import java.util.*;
public class CountFrequencyNumber {
    public static void calculate(int N,int D) {
        int c=0,d1;
        while(N!=0){
            d1=N%10;
            if(d1==D){
                c++;
            }
            N=N/10;
        }
        System.out.println("Frequency is : "+c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        calculate(n,d);
    }
}
