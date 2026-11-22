class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        if (target < nums[left] || target > nums[right]) return - 1;
        if (target == nums[left]) return left;
        if (target == nums[right]) return right;

        while (left < right) {
            int index = (right + left) / 2;
            int mid = nums[index];

            if (mid == target) return index;
            if (right - left == 1) return - 1;

            if (mid > target) {
                right = index;
            }
            else {
                left = index;
            }
        }

        return -1;
    }
}
