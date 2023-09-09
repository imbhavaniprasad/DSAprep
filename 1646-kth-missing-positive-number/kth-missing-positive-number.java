class Solution {
     public int findKthPositive(int[] arr, int k) {
      int n = arr.length;
        int left = 0,right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            int miss = arr[mid]-(mid+1);
            if(miss>=k){
                right=mid-1;
            }
            else left=mid+1;
            }
       // so ans would be right value + k - no of missing nums at right
       // arr[right]+k-(arr[right]-(right+1));
       return k+right+1;
    }
}