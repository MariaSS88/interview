import java.util.HashSet;
import java.util.Set;

public class RemoveDublicatesInString {
    public String removeDuplicates(String str){
        Set<Character> set = new HashSet<Character>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            if(!set.contains(Character.toLowerCase(str.charAt(i)))){
                set.add(Character.toLowerCase(str.charAt(i)));
                sb = sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main (String[] args){
        RemoveDublicatesInString test = new RemoveDublicatesInString();
        System.out.println(test.removeDuplicates("BAnanas"));
    }
}
