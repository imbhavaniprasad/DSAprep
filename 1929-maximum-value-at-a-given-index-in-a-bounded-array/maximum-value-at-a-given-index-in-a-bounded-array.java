class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int rightRange = n - index - 1;
        int leftRange = index;
        long h = maxSum, l = 1; // Change int to long for h and l coz mid could be big value
        int res = 0; // Change int to long for res coz we return int value
        while (l <= h) {
            long mid = (h - l) / 2 + l; // Change int to long for mid
            long leftSum = 0, rightSum = 0, el = mid - 1;
            //if left or right range is less than mid, apply //n*(n+1)/2-(mid-leftRange)*(mid-leftRange+1)/2;
            //if left or right range exceeds than mid,then all those values must be 1
            if (rightRange <= el)
                rightSum = (el * (el + 1)) / 2 - ((el - rightRange) * (el - rightRange + 1)) / 2;
            else
                rightSum = (el * (el + 1)) / 2 + (rightRange - el);
            if (leftRange <= el)
                leftSum = (el * (el + 1)) / 2 - ((el - leftRange) * (el - leftRange + 1)) / 2;
            else
                leftSum = (el * (el + 1)) / 2 + (leftRange - el);
            long sum = leftSum + mid + rightSum;
            if (sum <= maxSum) {
                l = mid + 1;
                res =(int) mid;
            } else {
                h = mid - 1;
            }
        }
        return res;
    }
}
