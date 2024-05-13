// input is in the form:
// 8
// codeforces
// aaaaa
// xxxxy
// co
// d
// nutdealer
// mwistht
// hhhhhhhhhh
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class DifferentString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(diff(arr[i]));
        }
    }
    
    public static String diff(String s) {
        StringBuilder sb = new StringBuilder(s);
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < sb.length(); i++) {
            set.add(s.substring(i, i+1));
            if (set.size() > 1) {
                System.out.println("YES");
                char curr = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(0));
                sb.setCharAt(0, curr);
                return sb.toString();
            }
        }
        return "NO"; 
    }
}