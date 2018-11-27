import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniquePermutation {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<Integer>(),nums,0);
        return result;
    }

    public void helper(List<List<Integer>> result, List<Integer> combo, int[] nums, int i){
        if(i == nums.length){
            result.add(arrayToList(nums));
            return;
        }
        for(int j = i; j<nums.length; j++){
            if(j>i && nums[j]==nums[j-1]) continue;
            swap(nums,i,j);
            helper(result,combo,nums,i+1);
            swap(nums,i,j);

        }
    }

    public void swap(int[] nums,int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public List<Integer> arrayToList(int[] nums){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<nums.length; i++){
            list.add(nums[i]);
        }
        return list;
    }
}
