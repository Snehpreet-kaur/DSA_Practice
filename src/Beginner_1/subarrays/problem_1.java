package Beginner_1.subarrays;
/*Given an array arr[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} of size 10. Find whether there exists a
 sub-array of size n and sum s, where n and s both are user input values.
Print YES if there exists a subarray of size n and sum s in the array arr else print NO*/
import java.util.*;
public class problem_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n=sc.nextInt();
        int s= sc.nextInt();
        int sum,flag=0,c,l =10;
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                c=0;sum=0;
                for(int k=i;k<=j;k++){
                    c++;
                    sum=sum+arr[k];
                    if(c==n && sum==s){
                        flag=1;
                        break;
                    }
                }
            }
        }
        if(flag==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
