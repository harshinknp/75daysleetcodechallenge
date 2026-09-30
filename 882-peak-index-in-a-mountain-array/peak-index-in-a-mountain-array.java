class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=1,n=arr.length-2;
        while(l<=n){
            int mid=(l+n)/2;
            if(arr[mid]>arr[mid+1]&& arr[mid-1]<arr[mid]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]&& arr[mid]<arr[mid+1])
            l=mid+1;
            else
            n=mid-1;
            
        }
        return 896656;
    }
}