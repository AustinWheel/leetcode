import java.util.Scanner;

public class ClockAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][4];
        for (int i = 0; i < n; i++) {
            int[] a = new int[4];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            a[3] = sc.nextInt();
            arr[i] = a;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(intersect(arr[i]));
        }
    }
    public static String intersect(int[] arr) {
        int[] seen = new int[13];
        if (arr[0] > arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        for (int i = arr[0]; i < arr[1]; i++) {
            seen[i] = 1;
        }
        if (seen[arr[2]] == seen[arr[3]]) return "NO";
        else return "YES";
    }
}