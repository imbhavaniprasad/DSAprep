class Solution {
    public int maxSubArray(int[] nums) {
        int maxSubTillIndex = nums[0],maxSoFar=nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSubTillIndex = Math.max(maxSubTillIndex+nums[i],  nums[i]);
            maxSoFar = Math.max(maxSubTillIndex, maxSoFar);
        }
        return maxSoFar;
    }
}