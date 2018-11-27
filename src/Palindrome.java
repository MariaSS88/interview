/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.*/
public class Palindrome {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        String ss = new String(s.toLowerCase());
        while (i < j){
            if (!Character.isLetterOrDigit(ss.charAt(i))){
                i++;
            }
            if (!Character.isLetterOrDigit(ss.charAt(j))){
                j--;
            }
            if (Character.isLetterOrDigit(ss.charAt(i))&&Character.isLetterOrDigit(ss.charAt(j))){
                if(ss.charAt(i) != ss.charAt(j)){
                    return false;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
}
