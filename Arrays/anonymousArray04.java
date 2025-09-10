package Arrays;
class Calc{
    public int add(int nums[]){
        int result = 0;
        for(int n : nums){
            result = result + n;
        }
        return result;
    }
}
public class anonymousArray04 {
    public static void main(String[] args){
        Calc obj = new Calc();

        int result = obj.add(new int[]{5,4,3,7}); 
 // Anonymous array -> In Java, an anonymous array is an array that is created and initialized without assigning it a name (i.e., a reference variable)
        System.out.println(result);
    }
}
