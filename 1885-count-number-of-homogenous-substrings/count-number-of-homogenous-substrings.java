class Solution {
    public int countHomogenous(String s) {
        long count=0,res=0;
        for(int i=0;i<s.length();){
            char ref = s.charAt(i);
            while(i<s.length() && s.charAt(i)==ref){
                ++count;
                i++;
                res=(res+count)%1000000007;
            }
           count=0;
        }
        return (int)res;
    }
}