public class MaxSumOfKElements {
    public int maxSum(int[] nums, int k){
        if(k > nums.length)return 0;
        int curSum = 0;
        for(int i = 0; i < k; i++){
            curSum+=nums[i];
        }
        int maxSum = curSum;
        for(int i = k; i < nums.length; i++){
            curSum = curSum - nums[i-k]+nums[i];
            maxSum = Math.max(maxSum,curSum);
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] nums = {1,2,10,5,3,7,8,0,2,9,12,4,3};
        MaxSumOfKElements test = new MaxSumOfKElements();
        System.out.println(test.maxSum(nums,4));
    }

}
