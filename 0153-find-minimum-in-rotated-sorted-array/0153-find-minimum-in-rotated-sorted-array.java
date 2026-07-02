class Solution {
    public int findMin(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // Mid is in the left sorted portion,
            // so the minimum must be to the right.
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            }
            // Mid is in the right sorted portion (or is the minimum),
            // so keep mid in the search space.
            else {
                high = mid;
            }
        }

        // low == high, pointing to the minimum.
        return nums[low];
    }
}

