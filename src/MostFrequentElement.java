import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MostFrequentElement {
    public int mostFrequentElement (int[] nums){
        if (nums.length == 0) return 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.replace(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int max = 0;
        int result = nums[0];
        for(Map.Entry<Integer,Integer> pair: map.entrySet()){
           // System.out.println(pair.getKey() + " "+ pair.getValue());
            if(pair.getValue() > max){
                max = pair.getValue();
                result = pair.getKey();
            }
        }
        return result;
    }

    public int mostFrequentElementWithSort(int[] nums){
        if ( nums.length == 0 ) return 0;
        int max = 0;
        int cur = 1;
        int res = nums[0];

        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++){
            while(i < nums.length && nums[i] == nums[i-1]){
                cur++;
                i++;
            }
            if(cur > max){
                max = cur;
                res = nums[i-1];
            }
            cur = 1;
        }
        return res;
    }

    public static void main (String[] args){
        MostFrequentElement test = new MostFrequentElement();
        int[] nums = {1,3,2,1,4,1,5,4,4,3,2,3,2,3,4,5};

        System.out.println(test.mostFrequentElement(nums));
        System.out.println(test.mostFrequentElementWithSort(nums));
    }
}
