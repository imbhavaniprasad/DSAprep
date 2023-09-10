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
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int ans = binarySearch(nums,0,pivot,target);
        return ans!=-1 ? ans : binarySearch(nums,pivot+1,nums.length-1,target);
    }
    public int binarySearch(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]>target){
                end = mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else return mid;
        }
        return -1;
    }
}