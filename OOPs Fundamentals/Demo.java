class Calc{
    public int add(int n1, int n2){
        int result = n1+n2;
        return result;
    }
    public int add(int n1, int n2, int n3){
        int result = n1 + n2 + n3;
        return result;
    }
    public double add(double n1, double n2){
     //here no of name & parameters are same to the other method still it works because Type of parameters are different.
        double result = n1 + n2; 
        return result;
    }
}


public class Demo {
    public static void main(String[]args){

        Calc obj = new Calc();

        int result = obj.add(4,3);

        int res2 = obj.add(4,3,2);

        double res3 = obj.add(4.5,6.6);

        System.out.println(result);
        System.out.println(res2);
        System.out.println(res3);
    }
}
