/*Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters*/

import java.util.LinkedList;
import java.util.List;

public class PhoneNumberLetterCombinations {
    public static final String[] LETTERS = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<String>();
        if(digits.length() == 0) return res;
        helper(digits, res, "", 0);
        return res;
    }

    public void helper(String digits, List<String> res, String cur, int n){
        if(cur.length() == digits.length()){
            res.add(cur);
            return;
        }
        int digit = digits.charAt(n)-'0';

        for(int i = 0; i < LETTERS[digit].length(); i++){
            helper(digits, res, cur+LETTERS[digit].charAt(i),n+1);
        }
    }
}
