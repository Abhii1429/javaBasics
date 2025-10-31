package string.mutableStrings;

public class mutableStr01 {
    public static void main(String[] args){
        // StringBuffer sb = new StringBuffer("Virat");
        StringBuilder sb = new StringBuilder("Virat");
        System.out.println(sb);

        //StringBuffer sb = " "; => Invalid
        sb.append("Kohli");
        System.out.println(sb);
    }
}
