class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0,j=1;
        while(k>0 && i<arr.length){
           if(arr[i]==j) {
               i++;
           }
           else {
              k--;
           }
             j++;
        }
        return k==0 ? j-1 : j+k-1;
    }
}