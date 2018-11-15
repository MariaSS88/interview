/*Write Interface,  which will give the  smallest number of the boxes to any given order.
To sell screws  we have  sets with 1, 2, 5 , 10 pieces.
*/
package amazon;

public class smallestNumberOfBoxes {
    static final int[] sets = {1,2,5,10};

    public static int smallestNumberOfBoxes(int order){
        int numberofBoxes = 0;
        int i = sets.length-1;
        while (order > 0){
            if(i < 0){
                numberofBoxes++;
                return numberofBoxes;
            }
            while(sets[i] <= order){
                order-=sets[i];
                numberofBoxes++;
            }
            i--;
        }
        return numberofBoxes;
    }

    public static void main(String[] args){
        System.out.print(smallestNumberOfBoxes(38));
    }
}
