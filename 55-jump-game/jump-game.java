class Solution {
    public boolean canReach(int i,int[] nums){
        for(int j=0;j<i;j++){
            if(j+nums[j]>=i) return true;
        }
        return false;
    }
    public boolean canJump(int[] nums) {
        if(nums.length==1)return true;
        for(int i=nums.length-1;i>=1;i--){
            if(!canReach(i,nums)) return false;
        }
     
        return true;
    }
}