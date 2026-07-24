class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] cut = new int[128];
        int ans = 0, n = s.length();
        for (int l = 0, r = 0; r < n; ++r) {
            char c = s.charAt(r);
            ++cut[c];
            while (cut[c] > 1) {
                --cut[s.charAt(l++)];
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}