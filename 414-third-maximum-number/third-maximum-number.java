class Solution {
    public int thirdMax(int[] nums) {
        int ans=-2147483648;
int max=-2147483648,secmax=-2147483648;
int check=0;
for(int i=0;i<nums.length;i++)
{
if(max<=nums[i])
max=nums[i];
}
for(int i=0;i<nums.length;i++)
{
if(secmax<=nums[i]&&nums[i]!=max)
secmax=nums[i];
}
for(int i=0;i<nums.length;i++)
{
if(ans<=nums[i]&&nums[i]!=max&&nums[i]!=secmax)
{
ans=nums[i];
check++;

        } 
    }
    
    if(check==0)
        ans=max;
    
  return ans;  
}

    }