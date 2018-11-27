/*Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines,
which together with x-axis forms a container, such that the container contains the most water.*/

public class MostWaterContainer {
    public int maxArea(int[] height) {
        int curr = 0;
        int max = curr;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            curr = Math.min(height[i], height[j])*(j-i);
            max = Math.max(curr,max);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}
