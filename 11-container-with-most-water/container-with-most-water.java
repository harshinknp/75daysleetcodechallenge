class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
           int min=Math.min(height[l],height[r]);
           int  width=r-l;
            int water=width*min;
            max=Math.max(max,water);
            if(height[l]<height[r])
            l++;
            else
            r--;
        }
        return max;
    }
}