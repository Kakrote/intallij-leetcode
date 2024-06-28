import java.util.Arrays;

public class Fliping_Image {
    public static void main(String[] args) {
        // [[1,1,0],[1,0,1],[0,0,0]]
        int [][] image={
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        Fliping_Image fl=new Fliping_Image();
        int [][] ans=fl.flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));

    }

    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row:image){
            // reversing the array
            for(int i=0;i<(image[0].length+1)/2;i++) {
                // swapping the values and with swapping we also xor it 
                int temp=row[i]^1;
                row[i]=row[image[0].length-i-1]^1;
                row[image[0].length-i-1]=temp;
            }
        }
        return image;
    }
}
