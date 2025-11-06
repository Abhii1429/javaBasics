package string.mutableStrings;

public class finalKeyword02 {
    public static void main(String[] args){
        final int a = 10; //value of variable beacomes fixed
        System.out.println(a);

        final StringBuffer sb = new StringBuffer("Virat");
        sb.append("Kohli"); 
        //final keyword doesn't changes the behavior of string object i.e. Mutability here
        System.out.println(sb);
        // sb = new StringBuffer("Sachin"); //new obj assignment cannot be made.
        System.out.println(sb);
    }
}
