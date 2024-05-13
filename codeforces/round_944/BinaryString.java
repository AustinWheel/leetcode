import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(cut(arr[i]));
        }
    }
    
    public static int cut(String s) {
        int decr=0;
        int cuts = 1;
        for (int r = 1; r < s.length(); r++) {
            if (s.charAt(r-1) == s.charAt(r)) continue;
            else cuts++;
            
            if (s.charAt(r) == '1' && s.charAt(r-1)=='0') decr = 1;
        }
        return cuts - decr;
    }
}