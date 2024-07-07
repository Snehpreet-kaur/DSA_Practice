package Beginner_1.maths;
/*In this task, you have to print n stars * vertically and n horizontally.*/
import java.io.*;
import java.util.*;
public class N_Stars {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int j=0;j<n;j++){
            System.out.println("*");
        }
    }
}
