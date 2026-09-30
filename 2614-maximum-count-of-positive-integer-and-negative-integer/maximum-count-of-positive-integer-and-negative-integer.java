class Solution {
    public int maximumCount(int[] nums) {

        int n = nums.length;

        // Positive count
        int l = 0;
        int h = n - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] <= 0) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        int positive = n - l;


        // Negative count
        l = 0;
        h = n - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] < 0) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        int negative = l;


        return Math.max(positive, negative);
    }
}