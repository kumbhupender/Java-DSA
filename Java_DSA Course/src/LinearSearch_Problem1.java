import java.util.Arrays;

public class LinearSearch_Problem1 {

    public static void main(String[] args) {

        //Problem 1 :: find the character in the string

        String name = "Stark";
        char ch = 'y';
        int length = name.length();


        System.out.println(linearSearch2(name,ch));
    }

    static boolean linearSearch2(String name , char ch){
//        String strArr = Arrays.toString(name.toCharArray());
        if(name.length() == 0 ){
            return false;
        }
        for(int i=0; i < name.length(); i++){
            if(name.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
}
