class Solution {
    public int singleNonDuplicate(int[] nums) {

        int l = 0;
        int h = nums.length - 1;

        while (l < h) {

            int mid = l + (h - l) / 2;

            // mid ko even index banao
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                // Pair correct hai, single right side mein hai
                l = mid + 2;
            } else {
                // Pair break ho gaya, single left side mein
                h = mid;
            }
        }

        return nums[l];
    }
}