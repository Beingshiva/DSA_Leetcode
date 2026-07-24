class Solution {
    public int lengthOfLongestSubstring(String s) {
      int left =0;int right=0; int maxlen=0;
      int [] frq=new int[128];
      for(right=0;right <s.length();right++){
        frq[s.charAt(right)]++;
        while(frq[s.charAt(right)]>1){
            frq[s.charAt(left)]--;
            left++;
        }
        int len=right-left+1;
        maxlen=Math.max(maxlen,len);
      }  
      return maxlen;
    }
}