package Inheritance_08;

class Human{ // super class / parent class / base class
    int age;
    void sleep(){
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student extends Human // in java; this is also known as "is a" relationship
{
    // Student class => sub class / child class / derived class
    // "extends" keyword facilitates the "relationship" between the classes(inheritance) 
  // this class contains the properties of Human class(Parent class)
}

public class inheritance_01 {
    public static void main(String[] args){
        Student st = new Student();

        st.sleep();
    }
}
