public class Linear_Search {
    public static void main(String[] args) {

        int arr[] = {10,7,5,3,6,9,8};
        int targetValue = 77;

        //invoke the function
        int result = searchAlgoritmLinear(arr,targetValue);
        System.out.println(result);
    }

    static int searchAlgoritmLinear(int[] arr,int targetValue){

        //checkout wether the element is present or not in the array
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i < arr.length; i++){
            int elements = arr[i];
            if(elements == targetValue){
                return 1;
            }
        }
        return -1;
    }
}
