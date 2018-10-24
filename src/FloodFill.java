
/*
An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).

Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.

To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.

At the end, return the modified image.
*/
public class FloodFill {
    public int[][] changeColor(int[][] image, int x, int y, int newColor){
        int color = image[x][y];
        image[x][y] = newColor;
        if(isValid(image,x+1,y,color)){
            changeColor(image,x+1,y,newColor);
        }
        if(isValid(image,x,y+1,color)){
            changeColor(image,x,y+1,newColor);
        }
        if(isValid(image,x-1,y,color)){
            changeColor(image,x-1,y,newColor);
        }
        if(isValid(image,x,y-1,color)){
            changeColor(image,x,y-1,newColor);
        }
        return image;
    }

    public boolean isValid(int[][] image,int x, int y, int color){
        if(x >= 0 && x < image.length && y >= 0 && y < image[0].length){
            if(image[x][y] == color) {
                return true;
            }
        }
        return false;
    }

    public void printImage(int[][] image){
        for(int i = 0; i < image.length; i++){
            for (int j = 0; j < image[0].length; j++){
                System.out.print(image[i][j]+ "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[][] image = {{1,2,1,1},{2,2,5,1},{1,3,5,5},{1,3,3,3},{2,5,2,2}};

        FloodFill test = new FloodFill();
        test.printImage(image);

        test.changeColor(image,2,1,2);
        test.printImage(image);
    }
}
