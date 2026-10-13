class Solution {
     public int arrangeCoins(int n) {
        
         long a=root (1l+8l*n);
        return (int)((a-1)/2);
    }
    public long root(long n){
        long l=1,h=n;
        
        while(l<=h){
               long mid=l+(h-l)/2;
               if(mid*mid==n){
             return mid;
               }
               else if(mid>n/mid) h=mid-1;
               else l=mid+1;
        }
        return h;
    }
   
}