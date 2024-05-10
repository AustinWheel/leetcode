import java.util.PriorityQueue;
import java.util.Comparator;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Comparator<int[]> comparator = new IntComparator();
        PriorityQueue<int[]> pq = new PriorityQueue<>(comparator);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                pq.add(new int[]{arr[i], arr[j]});
            }
        }
        for (int i = 0; i < k-1; i++) pq.poll();
        return pq.peek();
    }
}

class IntComparator implements Comparator<int[]> {
    public int compare(int[] a, int[] b) {
        double as = (double)a[0]/a[1];
        double bs = (double)b[0]/b[1];
        if (as < bs) return -1;
        if (as > bs) return 1;
        return 0;
    }
}