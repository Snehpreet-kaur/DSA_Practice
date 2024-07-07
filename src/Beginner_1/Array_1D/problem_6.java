package Beginner_1.Array_1D;
/*Write a program to find out the shortest distance between two even
positive integers in an array arr and print the distance. If there is
one or zero even positive integer in the array then return -1.
Note that if the index of one even positive integer is i and the index
of another even positive integer is j then their distance will be |i-j|.*/
import java.util.*;
public class problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0, ans = 0, dis = n;
        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 == 0 && arr[j] > 0) {
                c++;
            }
        }
        if (c >= 2) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
                        ans = j - i;
                        if (dis > ans) {
                            dis = ans;
                        }
                    }
                }
            }
        } else {
            dis = -1;
        }
        System.out.println(dis);
    }
}
