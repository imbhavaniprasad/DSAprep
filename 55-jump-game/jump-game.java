class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1)return true;
      boolean[] ans = new boolean[nums.length];
        int target=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=target){
                ans[i]=true;
                target=i;
            }
        }
        if(nums[0]>=nums.length) return true;
        int start=nums[0];
        while(start>0){
            if(ans[start--]==true) return true;
        }
        return false;
    }
}