import java.util.Arrays;

public class LinearSearchProblem6 {
    public static void main(String[] args) {
        //Problem 5 :: Search element in the 2D Array and find the minimum value in the 2D Array

        int[][] arr = {
                {10 , 20 , 30},
                {6 , 9 , 7},
                {8 ,12 , 78}
        };

        int ans = findMinValue(arr);

        System.out.println(ans);
    }

    static int findMinValue(int[][] arr){
        int min = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 1; col < arr[row].length; col++) {
                if(arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }return min;
    }
}
