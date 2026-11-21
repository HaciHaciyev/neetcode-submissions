class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        var res = new HashSet<List<Integer>>();

        int pivot = 0;
        int left = 1;
        int right = nums.length - 1;

        while (pivot < nums.length - 2) {
            left = pivot + 1;
            right = nums.length - 1;

            while (left < right) {
                int sum = nums[pivot] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(List.of(nums[pivot], nums[left], nums[right]));

                    int nextSum = nums[pivot] + nums[left + 1] + nums[right];
                    if (nextSum <= 0) {
                        left++;
                        continue;
                    };
                    if (nextSum > 0) {
                        right--;
                        continue;
                    }
                }


                if (sum > 0) right--;
                if (sum < 0) left++;
            }

            pivot++;
        }

        return res.stream().toList();
    }
}
