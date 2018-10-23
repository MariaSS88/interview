/* merge k number of sorted lists*/

import java.util.ArrayList;
import java.util.List;

public class MergeSortedLists {
    public List<Integer> mergeSortedLists(List<List<Integer>> lists){
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < lists.size(); i++){
            result = mergeTwoSortedLists(result, lists.get(i));
        }
        return result;
    }

    public List<Integer> mergeTwoSortedLists(List<Integer> l1, List<Integer> l2){
        List<Integer> result = new ArrayList<>();

        while(!l1.isEmpty()&&!l2.isEmpty()){
            while(!l1.isEmpty()&&!l2.isEmpty()&&l1.get(0)<=l2.get(0)){
                result.add(l1.remove(0));
            }
            while(!l2.isEmpty()&&!l1.isEmpty()&&l2.get(0)<l1.get(0)){
                result.add((l2.remove(0)));
            }
        }

        while (!l1.isEmpty()){
            result.add(l1.remove(0));
        }

        while (!l2.isEmpty()){
            result.add(l2.remove(0));
        }
        return result;
    }

    public static void main (String[] args){
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        lists.add(l1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(2);
        l2.add(4);
        l2.add(6);
        lists.add(l2);

        List<Integer> l3 = new ArrayList<>();
        l3.add(1);
        l3.add(5);
        l3.add(9);
        lists.add(l3);

        MergeSortedLists test = new MergeSortedLists();

        List<Integer> list = test.mergeSortedLists(lists);

        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
