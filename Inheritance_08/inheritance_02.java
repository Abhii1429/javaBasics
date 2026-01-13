package Inheritance_08;

class Human1{
    private String name;
    int age;

    Human1(){ // constructor class
        System.out.println("Human class constructor");
    }

    void sleep(){
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student1 extends Human1{
    void disp(){ // method
        System.out.println("The age is: "+age); // age is not part of this method but still we are able to use it, as it's part of child class.
        // System.out.println("The name is: "+ name); 
        // "name" is private member of Human1 class, that's why don't participate in inheritance
        //Note: Private members of a class don't participate in inheritance.
    }
}

public class inheritance_02 {
    public static void main(String[] args){
        Student1 st1 = new Student1();
        st1.sleep();
        st1.disp();
    }
}

// when constructor don't participate in inheritance then why output shows the constructor members?

// output:
// Human class constructor
// Human needs good sleep
// 18
// The age is: 18