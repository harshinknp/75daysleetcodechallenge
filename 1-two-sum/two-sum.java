class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int a=0,b=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                  a=i;
                  b=j;
                }
            }
        }
             return new int[]{a,b};
    }
}