package Inheritance_08;

class Human1{ // 4.) control from (3) comes to the parent class; it searches for zero parameter constructor and finds it.
    private String name;
    int age;

    Human1(){ // constructor class  // 5.) control comes here and executes the constructor body
        System.out.println("Human class constructor");
    } // after body execution, control goes back to (2) and then to (1)

    void sleep(){
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student1 extends Human1{ // Human1 is parent class of Student1 class

    // public Student1()
    // {                     // 2.) behind the scene, default Student1() constructor provided by the java compiler .
         // super();         // 3.) it calls the parent class constructor, Human1()
                        // super() method call is automatically inserted by the java compiler if we don't write it explicitly.   
    // }
    void disp(){ // method
        System.out.println("The age is: "+age); // age is not part of this method but still we are able to use it, as it's part of child class.
        // System.out.println("The name is: "+ name); 
        // "name" is private member of Human1 class, that's why don't participate in inheritance
        
        //Note: Private members of a class don't participate in inheritance.
    }
}

public class inheritance_02 {
    public static void main(String[] args){
        Student1 st1 = new Student1(); //1.) during object creation "Student1()" constructor is called, but there is no contructor in that  student class.
                                       // as it is automatically provided by the java compiler, which internally calls the parent class constructor "Human1()"  
                                      
                                       // hence the output shows the constructor members also.
                                       // this is the reason why constructor don't participate in inheritance.
                                       // because even if there is no constructor in the child class, the parent class constructor is still called.
                                       // this is done to ensure that the parent class is properly initialized before the child class.
                                       // this is also the reason why constructor don't have return type.

        // when we create an object of child class, the parent class constructor is called first, then the child class constructor is called.
        // this is done to ensure that the parent class is properly initialized before the child class.

        st1.sleep();
        st1.disp();
    }
}

// when constructor don't participate in inheritance then why output shows the constructor members?
//Ans=> 1-3

// output:
// Human class constructor ??
// Human needs good sleep
// 18
// The age is: 18