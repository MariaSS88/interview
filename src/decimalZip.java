import java.util.Stack;

public class decimalZip {

        public static int solution(int A, int B) {
            int C = 0;
            Stack<Integer> qA = intToQueue(A);
            while(!qA.isEmpty()){
                System.out.println(qA.pop());
            }
            return C;
        }

        private static Stack<Integer> intToQueue(int A){
            Stack<Integer> q = new Stack<Integer>();
            while(A > 0){
                q.push(A%10);
                A = A/10;
            }
            return q;
        }

        public static void main(String[] args){
            solution(123,321);
        }

}
