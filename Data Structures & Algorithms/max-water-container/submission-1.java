class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int maxArea = 0;
        while(i < j){
            int width = j - i, height = Math.min(heights[i], heights[j]);
            int area = width * height;
            maxArea = Math.max(maxArea, area);
            if(heights[i] < heights[j]) i++;
            else j--;
        }
        return maxArea;

        
    }
}
