class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        if (target < nums[left] || target > nums[right]) return - 1;
        if (target == nums[left]) return left;
        if (target == nums[right]) return right;

        int count = 0;
        while (left < right) {
            int index = (right + left) / 2;
            int mid = nums[index];

            System.out.println("Right = " + right + ", left = " + left);
            System.out.println("Index: " + index + ", value: " + mid);
            System.out.println();
            count++;
            if (count == 10) break;

            if (mid == target) return index;
            if (right - left == 1) return - 1;

            if (mid > target) {
                if (mid < nums[left]) return -1;
                right = index;
            }
            else {
                if (mid > nums[right]) return -1;
                left = index;
            }
        }

        return -1;
    }
}
