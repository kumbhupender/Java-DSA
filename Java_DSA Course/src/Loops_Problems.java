
public class Loops_Problems {

    public static void main(String[] args) {

        //Problem 1 : Find a repeat no in an user input number like 56472787

//        int num = 564728797;
//        int count = 0;
//
//        while(num > 0) {
//            int rem = num % 10;
//            if(rem == 7) {
//                count++;
//            }
//            num = num / 10;
//        }
//        System.out.println("The number 7 are appeared in the user number is " + count);


        //Problem 2 : Revese a number n = 12345; and o/p = 54321

        int n = 12345;
        int result = 0;

        while(n > 0){
            int rem = n % 10;  //5
            n = n / 10;        // 1234
            result = result * 10 + rem; // 0*10 + 5
        }
        System.out.println("Reverse number is : " +result);
    }
}
