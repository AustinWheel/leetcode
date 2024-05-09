import java.util.Arrays;
class Solution {
    public long maximumHappiness(int[] happiness, int k) {
        Arrays.sort(happiness);
        int decr = 0, res = 0;
        for (int i = 0; i < k; i++) {
            if (decr == k) break;
            res += happiness[i] - decr > 0 ? happiness[i] - decr : 0;
            decr++;
        }
        return res;
    }
}