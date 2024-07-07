package Beginner_1.subarrays;
/*There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
The biker starts his trip on point 0 with altitude equal 0. You are given an integer array gain[] of length n
where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n).
Print the highest altitude of a point that the biker reaches in his entire journey.*/
import java.util.*;
public class problem_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int alt=0,max=0;
        for(int i=0;i<N;i++){
            alt=alt+arr[i];
            if(alt>max){
                max=alt;
            }
        }
        System.out.println(max);
    }
}
