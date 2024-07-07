package Beginner_1.maths;
/*Given a temperature in Celsius, output the fahrenheit equivalent of it
Print complete answer up to 6 decimal places..*/
import java.util.*;
public class cel_to_fah {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double fah=((n*9)/5)+32;
        System.out.printf("%.6f",fah);
    }
}
