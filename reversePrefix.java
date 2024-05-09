class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder s = new StringBuilder(word);
        int r = word.indexOf(ch);
        int l = 0;
        while (l < r) {
            char t = s.charAt(r);
            s.setCharAt(r, s.charAt(l));
            s.setCharAt(l, t);
            l++;
            r--;
        }
        return s.toString();
    }
}