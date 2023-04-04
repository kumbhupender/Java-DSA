import java.util.Arrays;

public class P2_Average_Salary {
    public static void main(String[] args) {
        int[] arr = {4000, 5000, 7000, 3000, 8000};
        //Sort the array by using Array class
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //then iterate over an array and add salary but left min and max value in an array
        double temp = 0;
        for (int i = 1; i < arr.length-1; i++) {
            temp = temp + arr[i];
        }
        //excluding minimum and maximum in an array and find average or remaining
        double avg = temp / (arr.length-2);
        System.out.println(avg);

    }
}
