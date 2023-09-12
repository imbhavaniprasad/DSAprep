class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int emptyR = n - index - 1;
        int emptyL = index;
        long h = maxSum, l = 1; // Change int to long for h and l
        int res = 0; // Change int to long for res
        while (l <= h) {
            long mid = (h - l) / 2 + l; // Change int to long for mid
            long leftSum = 0, rightSum = 0, el = mid - 1;
            if (emptyR <= el)
                rightSum = (el * (el + 1)) / 2 - ((el - emptyR) * (el - emptyR + 1)) / 2;
            else
                rightSum = (el * (el + 1)) / 2 + (emptyR - el);
            if (emptyL <= el)
                leftSum = (el * (el + 1)) / 2 - ((el - emptyL) * (el - emptyL + 1)) / 2;
            else
                leftSum = (el * (el + 1)) / 2 + (emptyL - el);
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
