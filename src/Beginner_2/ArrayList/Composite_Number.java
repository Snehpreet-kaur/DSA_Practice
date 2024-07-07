package Beginner_2.ArrayList;
/*You are given an array A consisting of N integers. You have to remove all the composite numbers from the array.
Note Complete the given function and print the updated array. The input and output would be handled by the driver code.
You have to return the final arraylist.1 is neither prime nor composite.*/
import java.util.*;
public class Composite_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        ArrayList<Integer>abc=new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int t,c=0;
        for(int i=0;i<N;i++){
            t=arr[i];
            for(int j=1;j<=N;j++){
                if(t%j==0){
                    c++;
                }
            }
            if(c>2){
                abc.add(t);
            }
            c=0;
        }
        int m=abc.size();
        for(int i=0;i<m;i++){
            int f=abc.get(i);
            System.out.println(f);
        }
    }
}
