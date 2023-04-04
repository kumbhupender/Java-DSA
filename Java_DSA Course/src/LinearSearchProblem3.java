public class LinearSearchProblem3 {
    public static void main(String[] args) {

        int arr[] = {9,50,60,31,20,14};
        int targetValue = 14;
        int r1 = 1;
        int r2 = 4;

        System.out.println(findInRange(arr,targetValue,r1,r2));
    }

    static int findInRange(int[] arr , int targetValue,int r1 , int r2){
        if(arr.length == 0){
            return -1;
        }
        for(int i=r1; i < r2; i++){
            if(arr[i] == targetValue){
                return 1;
            }
        }
        return -1;
    }
}
