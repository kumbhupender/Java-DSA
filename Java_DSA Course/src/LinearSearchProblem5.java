import java.util.Arrays;

public class LinearSearchProblem5 {
    public static void main(String[] args) {
        //Problem 5 :: Search element in the 2D Array and return the index value in the form of [row,col]

        int[][] arr = {
                {1 , 2 , 3},
                {6 , 9 , 7},
                {8 ,12 , 78}
        };

        int targetValue = 9;

        int[] ans = findElementIn2DArray(arr,targetValue);

        System.out.println(Arrays.toString(ans));
    }

    static int[] findElementIn2DArray(int[][] arr , int targetValue){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == targetValue){
                    return new int[] {row,col};
                }
            }
        }return new int[] {-1,-1};
    }
}
