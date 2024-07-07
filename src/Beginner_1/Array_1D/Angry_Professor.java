package Beginner_1.Array_1D;
/*Discrete Mathematics professor has a class of n students.Frustrated with their lack of discipline, the professor
decides to cancel class if fewer than k students are present when class starts. Arrival times go from on time
(arrivalTime =<0) to arrived late (arrivalTime>0).Given the arrival time of each student and a threshold number of
attendees (k), determine if the class is canceled or not.*/
import java.util.*;
public class Angry_Professor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int time=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i] <= 0) {
                time++;
            }
        }
        if(time>k){
            System.out.println("Class is not cancelled");
        }else{
            System.out.println("Class is cancelled");
        }
    }
}
