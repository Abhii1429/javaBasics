package string;

public class comparingString02 {
    public static void main(String[] args){
        // String s1 = "pwskill";
        // String s2 = new String("pwskill");

        // System.out.println(s1 == s2);// compares references
        // System.out.println(s1.equals(s2)); // compares content

        //  String s1 = "pwskill";
        //  String s2 = "pwskill";
        //  String s3 = "pwJAVA";// java is statically typed language
        //  System.out.println(s1 == s2);
        //  System.out.println(s1 == s3);
        //  System.out.println(s1.equals(s2));
        //  System.out.println(s1.equals(s3));

         String s1 = "pwskill";
         String s2 = new String("Pwskill");
         String s3 = new String("pwskill");
         System.out.println(s1 == s2);
         System.out.println(s1 == s3);
         System.out.println(s2 == s3);

         System.out.println(s1.equals(s2));
         System.out.println(s1.equals(s3));
         System.out.println(s1.equalsIgnoreCase(s2));// ignores Upper/Lower cases
         System.out.println(s1.equalsIgnoreCase(s3));
    }
}
