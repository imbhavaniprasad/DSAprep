class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0,end=nums.length-1;
        if(nums.length==1) return nums[0];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid%2==0){
                if(mid+1<nums.length && nums[mid]==nums[mid+1]){
                    start=mid+1;
                }
                else end=mid-1;
            }
            else{
                if(nums[mid]==nums[mid-1]){
                    start = mid+1;
                }
                else end=mid-1;
            }
        }
        return nums[start];
    }
}