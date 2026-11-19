class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;

        var set = new HashSet<Integer>();
        for (var n : nums) {
            set.add(n);
        }

        if (set.size() == 1) return 1;

        for (var n : nums) {
            if (set.contains(n - 1)) continue;

            int temp = 1;
            while (set.contains(n + 1)) {
                temp++;
                n += 1;
            }
            
            if (temp > res) res = temp;
        }

        return res;
    }
}
