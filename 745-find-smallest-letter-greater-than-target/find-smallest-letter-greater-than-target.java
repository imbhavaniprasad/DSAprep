class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length;
        if(target<letters[start] || target>=letters[end-1]) return letters[start];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            }
            else if(letters[mid]<=target){
                start = mid+1;
            }
        }
        return letters[start];
    }
}