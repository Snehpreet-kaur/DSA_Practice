package Beginner_1.nested_loops;
/*Given an integer N, print a diamond full of stars * with height equal to N.
Note It is given that N is odd.*/
import java.util.*;
public class Diamond_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i+=2) {
            for (int k = i; k <= n; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2; j++) {
                if (j % 2 != 0) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int k=1;k<n;k+=2){
            for(int m=k;m<=k;m++){
                System.out.print("_");
            }
            for(int j=1;j<=k*2;j++){
                if(j%2!=0){
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
