public class RainWater {
    public int getWaterVolume(int[] heights){
        int vol = 0;
        int left = 0, right = heights.length-1;
        int max_left = 0, max_right = 0;

        while(left <= right){
            if ( max_left < max_right){
                vol+=((max_left - heights[left])>0?max_left - heights[left]:0);
               // System.out.println(vol);
                max_left = Math.max(max_left,heights[left]);
                left++;
            }else{
                vol+=((max_right-heights[right])>0?max_right-heights[right]:0);
               // System.out.println(vol);
                max_right = Math.max(max_right,heights[right]);
                right--;
            }
        }
        return vol;
    }

    public static void main (String[] args){
        RainWater test = new RainWater();
        int[] heights = {2,1,5,3,1,1,2,4,2,3};

        System.out.println(test.getWaterVolume(heights));
    }
}
