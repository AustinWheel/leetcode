// takes lines of inputs and creates and a list of the inputs and then
// calls the sorting function for each pair of inputs
// input is in the form of:
// 2
// 8 1
// 2 3
// output is in the form of:
// 1 8
// 2 3

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class MyFirstSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int[] a = sort(arr[i][0], arr[i][1]);
            System.out.println(a[0] + " " + a[1]);
        }
    }
    public static int[] sort(int a, int b) {
        int[] res = new int[2];
        if (a > b) {
            res[0] = b;
            res[1] = a;
        } else {
            res[0] = a;
            res[1] = b;
        }
        return res;
    }
}