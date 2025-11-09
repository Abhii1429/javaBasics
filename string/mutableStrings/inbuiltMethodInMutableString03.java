package string.mutableStrings;

public class inbuiltMethodInMutableString03 {
    public static void main(String[] args){
        // StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        System.out.println("Initial capacity: "+sb.capacity()); // 16
        sb.append("abcdefghijklmnop");
        System.out.println("Capacity: "+ sb.capacity()); // 16
        sb.append("a");
        System.out.println("New capacity: "+sb.capacity()); // 34
        // new capacity = (current capacity+1)*2
        // capacity => how many characters you can add
        // length() => how many characters are present
        System.out.println("length of string:" + sb.length());

        StringBuffer sb2 = new StringBuffer("Sachin");
        System.out.println(sb2);
        System.out.println(sb2.capacity()); // output= 16+6=22; When string is passed in contructor then intial length if that StringBuffer/Builder class becomes enlarge as the length of string + intial length
        System.out.println(sb.charAt(1)); // output= S
        // System.out.println(sb2.setCharAt(1,'A')); error=> setCharAt() inbuilt class is Void in nature that's why cannot be printed
        sb2.setCharAt(1,'A');
        System.out.println("New string after replacement: "+sb2);

        StringBuilder sb3 = new StringBuilder(150);
        System.out.println("Size of String class: "+sb3.capacity()); // 150
        sb3.append("java");
        System.out.println(sb3);
        sb3.trimToSize(); // reduces the size from 150 to equals to the length of string(no of character)
        System.out.println("Reduced size: "+sb3.capacity());

        StringBuffer sb4 = new StringBuffer("pwjava");
        System.out.println(sb4);
        System.out.println("Reversed string: "+sb4.reverse()); // this method reverses the string
    }
}
  