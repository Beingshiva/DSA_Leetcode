class Solution {
    public boolean isAnagram(String s, String t) {
       int [] frq=new int[26];
     if(s.length() != t.length()) return false;
        for(int i =0;i<s.length();i++){
          frq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            frq[t.charAt(i)-'a']--;
        }
          for(int i=0;i<26;i++){
            if( frq[i]!=0)return false;
          }
          return true;
    }
}


       