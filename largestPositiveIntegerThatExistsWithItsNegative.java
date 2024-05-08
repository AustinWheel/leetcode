import java.util.HashSet;

class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> negative = new HashSet<>();
        for (int i : nums) {if (i < 0) negative.add(i);}
        int max = 0;
        for (int i : nums) {
            if (i > 0 && i > max && negative.contains(-1*i)) max = i;
        }
        return max != 0 ? max : -1;
    }
}