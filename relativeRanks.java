import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < score.length; i++) {pos.put(score[i], i);}
        int[] sorted = new int[getMax(score)+1];
        Arrays.fill(sorted, -1);
        for (int i=0; i < score.length; i++) {sorted[score[i]] = score[i];}
        int rank = 1;
        String[] res = new String[score.length];
        for (int i = sorted.length-1; i >= 0; i--) {
            if (sorted[i] == -1) continue;
            if (rank==1) res[pos.get(sorted[i])] = "Gold Medal";
            else if (rank==2) res[pos.get(sorted[i])] = "Silver Medal";
            else if (rank==3) res[pos.get(sorted[i])] = "Bronze Medal";
            else res[pos.get(sorted[i])] = String.valueOf(rank);
            rank++;
        }
        return res;
    }
    
    public int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {if (arr[i] > max) max = arr[i];}
        return max;
    }
}