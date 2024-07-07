package Beginner_1.Array_1D;
/*A Contest is held and a total of N participants took part in the contest. You are already given the scores of the
participants in the form of an array (of size N).The contestant who has a score greater than or equal to the score
of the K-th Participant (where K<=N) will advance to the next round, as long as the contestant has a positive score.
Calculate the total number of participants who will advance to the next round.*/
import java.util.*;
public class A_contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int arr[]=new int[N];
        int c=0;
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        if(arr[K]!=0){
            for(int i=0;i<N;i++){
                if(arr[K]<=arr[i]){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
