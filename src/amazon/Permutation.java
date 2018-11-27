package amazon;

public class Permutation {
    int first;
    int number;

    public Permutation(int first, int number){
        this.first = first;
        this.number = number;
    }

    public void biggerPermutations(){

    }
    private int getLength(){
        int n = 0;
        int num = first;
        while(num > 0){
            num = num/10;
            n++;
        }
        return n;
    }

    private int[] numberToArray(int num){
        int i = getLength();
        int[] array = new int[i];
        i--;
        while (num>0){
            array[i] = num%10;
            num = num/10;
            i--;
        }
        return array;
    }

    private int arrayToNumber(int[] array){
        int num = 0;
        for (int i = array.length-1; i>=0; i--){
            num = (int) (num+array[i]*Math.pow(10,array.length-i-1));
        }
        return num;
    }

    private void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void nextNPermutations(){
        int start = first;
        for (int i = 0; i < number; i++){
            start = nextPermutation(start);
            System.out.println(start);
        }
    }

    private int nextPermutation(int base){
        int[] array = numberToArray(base);

        int i = array.length - 2;
        while(i >= 0 && array[i] >= array[i+1]){
            i--;
        }

        if (i >= 0){
            int j = array.length - 1;
            while (j>=0 && array[i] >= array[j]){
                j--;
            }
            swap(array, i, j);
        }
        reverse (array, i+1);
        return arrayToNumber(array);
    }

    private void reverse( int[] array, int i){
        int j = array.length-1;

        while(i < j){
            swap(array,i,j);
            i++;
            j--;
        }
    }

    private void swap(int[] array, int i, int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void main (String[] args0){
        Permutation test = new Permutation(1234, 4);
        test.nextNPermutations();
    }
}
