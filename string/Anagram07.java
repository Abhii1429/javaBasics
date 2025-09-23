package string;
import java.util.*;
public class Anagram07 {
    public static void main(String[] args){
        // String str1 = "School Master";
        // String str2 = "The Classroom";

        //for removing spaces : String is immutable, so only refrence is being changed
        // str1 = str1.replace(" ", "");
        // str2 = str2.replace(" ", "");

        // str1 = str1.toLowerCase();
        // str2 = str2.toLowerCase();
        
        String str1 = "keep";
        String str2 = "peep";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
    }
}
