class Solution {
    public int findPivot(int[] nums){
        int start = 0,end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid+1 <nums.length && nums[mid]>nums[mid+1]) return mid;
            if(mid-1 >=0 && nums[mid]<nums[mid-1]) return mid-1;
            if(nums[start]>nums[mid]) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }
    public int findMin(int[] nums) {
        return nums[findPivot(nums)+1];
    }
}