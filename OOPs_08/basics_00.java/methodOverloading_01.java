// Method overloading :

// => when multiple methods in the same class have the same name but different parameters (different type or different number of parameters)

// also called as False / Static / compile time polymorphism

class Calculator
{
    int add(int x, int y) // arrangement to receive argument values is called parameters(x, y)
    {
        // int res = x + y;
        // return res;
        return x + y;
    }
    // void add(int x, int y) // above method & this mehtod is same; same name with same parameters, return type is not considered for method overloading, so this will give error.
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

// nothing is overloaded in method overloading, only the method name is same but the parameters are different.

// compiler resolves the method call at compile time based on the method signature (method name + parameters).

// Note:
// 1) Method overloading is performed within the same class.
// 2) Method overloading is the example of compile time polymorphism.
