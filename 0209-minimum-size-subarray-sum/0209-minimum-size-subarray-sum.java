class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int sum=0;
       int left=0;
       int right=0;
       int minwindowsize=Integer.MAX_VALUE;
       while(right<nums.length){
        sum+=nums[right];
        right++;
        while(sum>=target){
            int windowsize=right-left;
            minwindowsize=Math.min(windowsize,minwindowsize);
            sum -=nums[left];
            left++;
        }
       } 
        return minwindowsize==Integer.MAX_VALUE?0:minwindowsize;
    }
}