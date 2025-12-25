package Constructor_07;
// If we have to do the initialization of instance variables at the time of object creation itself then use of constructor comes into the picture
class Student{
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class basics_02 {
    public static void main(String[] args){
        Student st = new Student("Rahul", 10); // constructor called here
        // object creation, memory allocation and initialization done in one step with help of constructor
        // during object creation, constructor is called; which initializes the instance variables with values sent from object
    }
}
// =================================
 // Constructor is a special method that is called when an object is created
        // It is used to initialize the object
        // It has the same name as the class
        // It does not have a return type
        // It can have parameters

        // Default constructor
        // If no constructor is defined, Java provides a default constructor
        // Default constructor initializes instance variables to default values (0, null, false)

        // Parameterized constructor
        // A constructor that takes parameters to initialize instance variables

        // Example of default constructor
        // class Student{
        //     int age;
        //     String name;

        //     // Default constructor
        //     Student(){
        //         age = 18;
        //         name = "John";
        //     }

        //     void display(){
        //         System.out.println("Name: " + name + ", Age: " + age);
        //     }
        // }

        // Student obj = new Student(); // Calls default constructor
        // obj.display(); // Output: Name: John, Age: 18

        // // Example of parameterized constructor
        // class StudentParam{
        //     int age;
        //     String name;

        //     // Parameterized constructor
        //     StudentParam(int a, String n){
        //         age = a;
        //         name = n;
        //     }

        //     void display(){
        //         System.out.println("Name: " + name + ", Age: " + age);
        //     }
        // }

        // StudentParam objParam = new StudentParam(20, "Alice"); // Calls parameterized constructor
        // objParam.display(); // Output: Name: Alice, Age: 20