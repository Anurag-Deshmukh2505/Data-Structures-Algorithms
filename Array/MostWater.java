package Array;

public class MostWater {
    public int getMaxWater(int[] heights){
        int leftIdx = 0, rightIdx = heights.length - 1;
        int area = 0, maxArea = 0;
        while(leftIdx < rightIdx){
            area = Math.min(heights[leftIdx], heights[rightIdx]) * (rightIdx - leftIdx);
            maxArea = Math.max(area, maxArea);

            if(heights[leftIdx] < heights[rightIdx]){
                leftIdx++;
            }else{
                rightIdx--;
            }
        }

        return maxArea;
    }
}
