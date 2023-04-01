public class ArrayProblem_2 {
    public static void main(String[] args) {
        //Problem :: Find the max value in the array
        int[] arr = {50,70,20,40,30,90};
        System.out.println(maxValue(arr));
    }
    static int maxValue(int[] arr) {
        int max = arr[0];

        for(int i=1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }return max;
    }

}
