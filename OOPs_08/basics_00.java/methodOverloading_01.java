// method overloading => when multiple methods in the same class have the same name but different parameters (different type or different number of parameters)

class Calculator
{
    int add(int x, int y) // arrangement to receive argument values is callles parameters(x, y)
    {
        // int res = x + y;
        // return res;
        return x + y;
    }
    // void add(int x, int y) // above method & this mehtod is same name with same parameters
    // {
        
    // }

    float add(int x, float y)
    {
        return x + y;
    }

    int add(int x, int y, int z)
    {
        return x + y + z;
    }

    double add( int x, double y, double z)
    {
        return x + y + z;
    }

    double add(double x, double y, double z)
    {
        return x + y + z;
    }

}
public class methodOverloading_01 {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.add(10, 20, 30); // here 10, 20, 30 are arguments
        calc.add(10, 20);
        calc.add(10.4, 20.5, 30.5);
    }
}
