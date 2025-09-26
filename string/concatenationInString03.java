package string;

public class concatenationInString03 {
    public static void main(String[] args) {
    //      String s1 = new String("pw");
    //      s1.concat("skill");// s1 is immutable as "String" is used.
    //      s1 = s1.concat("skill");
    //      //s1" starts to point to new object; previous "pw" is left alone.
    //      System.out.println(s1);

    // String s1 = "pwjava";

    // String s2 = s1.concat("skill");
    // // no "new " keyword "is used still object will be formed in heap area
    // String s3 = new String("pwjava");
    // s3 = s3.concat("skill");
    // System.out.println(s1);
    // System.out.println(s2);
    // System.out.println(s3);

    // "+" concatenation
    String s1 = "pw";
    String s2 = "pw" + "java";
    String s3 = "pw" + "java" + "skill";
    String s4 = s1 + s2;
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);

    String str = "pw" + 100 + 99;
    System.out.println(str);
    }
}
