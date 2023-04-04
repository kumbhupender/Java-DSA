public class LinearSearchLeetCodeProblem {
    public static void main(String[] args) {
        /* Problem :: Find the count of even numbers in the array
           e.g. 12 = two digits i.e. even
                131 = three digits i.e. odd
         */

        /* We have to divide this problem into three parts and create three functions
            1. Find the count of the element digit in the array
            2. Check that count digit is even or not
            3. Check if even then return the value
         */

        int arr[] = {12,345,6,7896};
        System.out.println(fingEvenDigit(arr));

    }

    //Count no of digits in an element of the arr
    static int digits(int num){
        int count = 0;

        while(num > 0){
            count++;
            num = num / 10;
        }
        return count++;  //because after completing the iteration it's return the count value
    }

    //check wether the count digit is even or not
    static boolean checkEven(int num){
        int evenDigit = digits(num);

        if(evenDigit % 2 == 0){
            return true;
        }
        return false;
    }

    //Now the main function to count the even digits in array
    static int fingEvenDigit(int[] nums){
        int count = 0;

        for(int num : nums){
            if(checkEven(num)){
                 count++;
            }
        }return count;
    }
}
