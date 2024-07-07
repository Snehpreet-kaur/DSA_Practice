package Beginner_1.Loops;
/*Write a program to calculate the sum of first 10 natural number.*/
public class print_Sum_10 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
