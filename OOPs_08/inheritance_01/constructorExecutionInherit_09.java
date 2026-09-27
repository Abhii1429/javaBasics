package OOPs_08.inheritance_01;
// constructor execution in inheritance

class Demo1{
    int a, b; // instance variable
    
    public Demo1(){ // 3) & 33) & 2nd case when this() method is invoked)) reference comes here and class gets executed  when task is done then it get back to from where it had come.
        System.out.println("Parent class constructor");
    }
    public Demo1(int x, int y){ // 44) reference comes here and class gets executed  when task is done then it get back to from where it had come.
        System.out.println("Parameterized Parent class constructor");
        a = x;
        b = y;
        System.out.println(a);
    }
}

class Demo2 extends Demo1{
        int m,n;
        public Demo2(){ // Zero parameterized constructor
        
            this(10,20); // 2nd case when this() method constructor is used )) reference enter the child field from object declaration and it finds this method which takes it to parameterized constructor of child class => Demo2(int x, int y)

            // super(); // 2) reference enter the child field but it finds implicit super method which takes it back to parent class => Demo1()

            // super(10,20); // if this is invoked through constructor then zero parameter parent class content will run.
            System.out.println("Child class constructor"); // 4) after parent class constructor execution, it comes back to child class and executes the content of child class constructor i.e print statement will be executed.
        }
        public Demo2(int x, int y){ // parameterized constructor

            super(); // 22) & 2nd case of this() method invokation))  when parameterized constructor is invoked then it will refer to the zero parameterized parent class constructor because of implicit super method call, and control will got to parent class with zero parameter => Demo1() and after execution of parent class constructor, it will come back to child class constructor and execute the content of child class constructor.

            // super(10,20); // 44) but if this super method call is invoked then it will refer to the parametrized parent method.
            System.out.println("Parameterized child class constructor");
            m = x;
            n = y;    
        }
}
// ------------------Main Class----------------------
public class constructorExecutionInherit_09
{
    public static void main(String[] args){
        Demo2 d = new Demo2(); // 1) here child class object is created, and child class constructor is called.
        // Demo2 d2 = new Demo2(10,20); // 11) if this get invoked then it will refer to the parameterized constructor 
    }
}

// Output (in case of using this() method in child class constructor):

// Parent class constructor
// Parameterized child class constructor
// Child class constructor

//------------------------------------------------------

// Notes:

// Even using the child class for object creation, parent class gets printed first because of impicit super function call invokation for parent class.

// If i want to print parameterized constructor without creating object, I can do that by passing arguments in super() method in child class.

// if we have written this() class constructor in child class then super() method will not be invoked because this() method is used to call the constructor of the same class. 
// OR
// If a child constructor contains this(), Java does not implicitly add super() to that constructor.