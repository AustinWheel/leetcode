class Solution {
    public int compareVersion(String version1, String version2) {
        String[] strs1 = version1.split("\\.");
        String[] strs2 = version2.split("\\.");
        int n = strs1.length > strs2.length ? strs1.length : strs2.length;
        for (int i = 0; i < n; i++) {
            String str1 = i < strs1.length ? removeLeadingZeroes(strs1[i]) : "0";
            String str2 = i < strs2.length ? removeLeadingZeroes(strs2[i]) : "0";
            if ( (Integer.parseInt(str1)) > (Integer.parseInt(str2))) return 1;
            if ( (Integer.parseInt(str1)) < (Integer.parseInt(str2))) return -1;
        }
        return 0;
    }
    
    public String removeLeadingZeroes(String str) {
        int n = str.length();
        boolean found = false;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if ((int) str.charAt(i) != 0) found = true;
            if (found) res.append(str.charAt(i));
        }
        String ret = res.toString();
        if (ret.equals("")) return "0";
        return ret;
    }
}