/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       int lef=1;int ri=n;
       while(lef<ri){
        int mid=lef+(ri-lef)/2;
        if(isBadVersion(mid)){
            ri=mid;
        }else{
            lef=mid+1;
        }
       }
       return lef;
    }
}