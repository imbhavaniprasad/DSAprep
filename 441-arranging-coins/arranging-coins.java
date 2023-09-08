class Solution {
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        while(start<=end){
            long mid = start + (end-start)/2;
            if((mid*(mid+1))/2>n){
                end = mid-1;
            }
            else if((mid*(mid+1))/2<n){
                start = mid+1;
            }
            else return (int)mid;
        }
        return (int)end;
    }
}