import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> uniqueCombinations(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        helperUnique (nums, target, result, new ArrayList<>(), 0, 0);
        return result;
    }

    public void helperUnique(int[] nums, int target, List<List<Integer>> result, List<Integer> combo, int s, int i){
        if(s == target){
            result.add(combo);
            printCombo(combo);
        }

        for(int j = i; j < nums.length; j++){
            if(s<target) {
                s += nums[j];
                combo.add(nums[j]);
                helperUnique(nums, target, result, combo, s, j);
                combo.remove(combo.size() - 1);
                s -= nums[j];
            }
        }
    }

    public void printCombo(List<Integer> combo){
        for(Integer num: combo){
            System.out.print(num + "  ");
        }
        System.out.println();
    }

    public static void main (String[] args){
        CombinationSum test = new CombinationSum();
        int[] nums = {2,4,6,8};
        test.uniqueCombinations(nums,8);
    }
}
