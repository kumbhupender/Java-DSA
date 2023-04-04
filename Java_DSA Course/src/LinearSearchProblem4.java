public class LinearSearchProblem4 {
    public static void main(String[] args) {

        //Problem 3 :: Search minumum value in the array

        int arr[] = {2,5,7,3,0,5,-9,40};

        System.out.println(findMinimum(arr));
    }

    static int findMinimum(int[] arr){
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }return min;
    }
}
