package Beginner_2.unsolved;
/*You are given a number n, you are required to print the first n rows of the pascal triangle.

Pascal Triangle

Your task is to complete the function pascalTriangle which receives n as the parameters and
returns a 2D array containing the first n rows of the pascal's triangle.

Input Format
You are given a single integer n representing the number of rows of pascal's triangle.*/
import java.util.*;
public class Pascal_tri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1,b=1;

        ArrayList<Integer>abc=new ArrayList<Integer>();
        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==j || j==0){
                    System.out.print(1);
                }else{
                    System.out.print(a+b);
                    b=a+b;
                }
            }
            System.out.println();
        }
    }
}
