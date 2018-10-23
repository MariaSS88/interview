public class oneStepEditStrings {

    public static boolean isOneStepEdit(String s1, String s2){
        if(s1.length() != s2.length()) {
            if (Math.abs(s1.length() - s2.length()) == 1) {
                if (s1.length() > s2.length()) {
                    return isDeleteOne(s1,s2);
                } else {
                    return isDeleteOne(s2,s1);
                }
            }
        }
        return isOneDiff(s1,s2);

    }

    public static boolean isDeleteOne(String s1, String s2){
        for(int i = 0; i < s1.length(); i++){
            StringBuilder s3 = new StringBuilder(s1);
            s3.deleteCharAt(i);
         //   System.out.println(s2 + " "+s1+" "+s3);
            if(s3.toString().equals(s2)){
                return true;
            }
        }
        return false;
    }

    public static boolean isOneDiff(String s1, String s2){
        int n = 0;
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                n++;
                if (n>1) return false;
            }
        }
        if (n==1) {
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(isOneStepEdit("cat","mat"));
        System.out.println(isOneStepEdit("cat","maat"));
        System.out.println(isOneStepEdit("cat","ccat"));
        System.out.println(isOneStepEdit("cat","at"));
        System.out.println(isOneStepEdit("","mat"));
    }
}
