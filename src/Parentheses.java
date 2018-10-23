import java.util.Stack;

public class Parentheses {
    public static String makeValidParentheses(String str){
        StringBuilder strB = new StringBuilder(str);
        Stack<Integer> st = new Stack<Integer>();
        int i = 0;
        while( i < strB.length()){
            if(strB.charAt(i) == '('){
                st.push(i);
                i++;
            }else if (strB.charAt(i) == ')'){
                if(st.isEmpty()){
                    strB.deleteCharAt(i);
                }else {
                    st.pop();
                    i++;
                }
            }
        }
        while(!st.isEmpty()){
            strB.deleteCharAt(st.pop());
        }
        return new String(strB);
    }

    public static void main (String[] args){
        System.out.println(makeValidParentheses("(("));
    }
}
