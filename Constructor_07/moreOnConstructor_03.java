package Constructor_07;

class Demo{
    private int a;
    private int b;

    // Default constructor (provided by Java compiler):
    // public Demo(){ // zero parameterized constructor: no-argument constructor

    // }

    public Demo(){ // Manually created zero parameterized constructor by Dev.
        System.out.println("Zero parameterized constructor by programmer or Devloper");
    }

    // Parameterized constructor
    public Demo(int a, int b){
        this.a = a;
        this.b = b;
    }

    void disp(){
        System.out.println(a);
        System.out.println(b);
    }
}

public class moreOnConstructor_03 {
    public static void main(String[] args){
        Demo d = new Demo(); // constructor called here
        // when no constructor is defined in a class,why it's still possible to create object of that class?
        // answer: because java compiler provides a default constructor if no constructor is defined in a class
        // this default constructor initializes instance variables to default values(0 for int,null for String,false for boolean)
        d.disp(); 
        
        // d.add(); // it's shows error because no method named add() is defined in Demo class 

        // Demo d2 = new Demo(10,20); 
        // Same constructor is called here but it shows error; why?
        // Ans: because no parameterized constructor is defined in Demo class which takes two int parameters
        // so while creating object with two int arguments,java compiler looks for a constructor with two int parameters in Demo class
        // but it is not found; hence it shows error; let's create one to remove this error

        Demo d2 = new Demo(10,20); // now it works fine
        d2.disp();
        // but how java compiler differentiate between default constructor and parameterized constructor while creating object?
        // answer: it differentiates based on arguments sent from object while creating object

        // but when we created the parameterized constructor of Demo class; then Default constructor is no longer provided by java compiler and it shows error while creating object without arguments
        // because now java compiler sees that a constructor is already defined in Demo class; hence it will not provide default constructor
    } 
} 
// Note: If we want to have both default constructor and parameterized constructor in a class; then we have to define default constructor manually as shown above

//Output:
// Zero parameterized constructor by Dev.
// 0
// 0
// 10
// 20