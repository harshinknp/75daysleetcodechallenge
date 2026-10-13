class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row= arr.length,col=arr[0].length;
        int l=0,h=row*col-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int rowmd=mid/col;
            int colmd=mid%col;
            if(arr[rowmd][colmd]==target) return true;
            else if(arr[rowmd][colmd]>target) h=mid-1;
            else l=mid+1;
        }
        return false;
    }
}