package Beginner_1.nested_loops;
/*Given an integer n, print a pattern of n lines, where the ith line has the numbers i to 1 printed in descending order.
eg: if n=3
1
21
321*/
import java.util.*;
public class number_pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N =sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
