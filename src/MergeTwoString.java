//given three strings, two source and one target, figure out if the target can be formed by interleaving the two source strings

//not finish
public class MergeTwoString {
    public boolean isStringMergedFromTwo(String first, String second, String third){
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length() && j < second.length() && k < third.length()){
            if (first.charAt(i)!=third.charAt(k)){
                return false;
            }
            i++;
            k++;
            if (k< third.length() && second.charAt(j)!=third.charAt(k)){
                return false;
            }
            j++;
            k++;
        }
        if(k != third.length()){
            if( i != first.length()){

            }else if (j != second.length()){

            }
        }

        return true;
    }
}
