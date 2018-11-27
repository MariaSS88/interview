public class LongestContinuousSubarray {
    public int length(int[] array){
        int max = 0;
        int cur = 0;

        for(int i = 1; i < array.length - max; i++){
            if(array[i] > array[i-1]){
                cur++;
            }else{
                cur = 1;
            }
            max = Math.max(max,cur);
        }
        return max;
    }

    public static void main(String[] args){
        LongestContinuousSubarray test = new LongestContinuousSubarray();
        int[] array = {7,8,12,5,9,17,21,9,10,1};
        System.out.println(test.length(array));
    }
}
