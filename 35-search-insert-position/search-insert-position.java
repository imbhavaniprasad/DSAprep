class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0,end = nums.length;
        if(target<nums[0]) return 0;
        if(target>nums[end-1]) return end;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else return mid;
        }
        return start;
    }
}