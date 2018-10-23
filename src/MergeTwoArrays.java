public class MergeTwoArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(k>=0){
            while (i>=0 && j>=0 && k>=0 && nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            while (j>=0 && i>=0 && k>=0 && nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }

    public  static void main (String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {3,4,5};
    }

}
