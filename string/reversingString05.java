package string;

public class reversingString05 {
    public static void main(String[] args){
        // String str1 = "pwjava";
        // String str2 = "";

        // // case-1 
        // for(int i = str1.length()-1; i >= 0; i--){
        //     str2 = str2 + str1.charAt(i);
        // }
        // System.out.println("before :" + str1);
        // System.out.println("After :" + str2);  
        
        // case-2 => using Array 
        // String str1 = "pwskill java";
        // String str2 = " ";
        // String sarr[] = str1.split(" "); // var.split() removes empty spaces

        // for (int i = sarr.length-1; i >= 0; i--){
        //     str2 = str2 +sarr[i] +" ";
        // }
        // System.out.println("Before:" + str1);
        // System.out.println("After:"+ str2);
    
        
        // case-3
        // String str1 = "pwskill java";
        // String str2 = " ";
        
        // for (int i = str1.length()-1; i >= 0; i--){
        //     str2 = str2 + str1.charAt(i);
        // }
        // System.out.println("Before Reversing:" + str1);
        // System.out.println("After Reversing:"+ str2);

        //case => reversing at the same place
        String str1 = "pwskill java";
        String str2 = " ";
        
        String arr[] = str1.split(" ");// array creation

        for(String ele : arr)
        {
           for (int i = ele.length()-1; i >= 0; i--){
               str2 = str2 + ele.charAt(i); //  taking each index of array and reversing a same place
           }
           str2 = str2+" ";
        }   
        System.out.println("Before Reversing:" + str1);
        System.out.println("After Reversing:"+ str2);
    }
}
