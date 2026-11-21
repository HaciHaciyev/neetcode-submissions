
class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int[] stack = new int[n];
        int top = -1;

        int maxArea = 0;

        for (int i = 0; i <= n; i++) {

            int currentHeight = (i == n) ? 0 : heights[i];

            while (top >= 0 &&
                   currentHeight < heights[stack[top]]) {

                int height = heights[stack[top--]];

                int left = (top >= 0) ? stack[top] : -1;

                int width = i - left - 1;

                int area = height * width;

                maxArea = Math.max(maxArea, area);
            }

            if (i < n) {
                stack[++top] = i;
            }
        }

        return maxArea;
    }
}
