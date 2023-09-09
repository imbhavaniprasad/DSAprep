class Solution {
    public int specialArray(int[] nums) {
     int i=1,count=0;
     while(i<=nums.length){
         count=0;
         for(int a:nums){
             if(a>=i){
++count;
             }
             if(count>i) break;
         }
         if(count==i) return i;
         i++;
     }
     return -1;
    }
}