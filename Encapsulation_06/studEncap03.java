package Encapsulation_06;
// Example of 'this' keyword to resolve shadowing problem
// Shadowing problem occurs when local variable and instance variable have same name

class Student1{
    private int age; // instance variable
    private String name;

    public void setData1(int age){ // method to set data
        
        // age = a; // a => local variable
        // here 'age' is an instance variable
        // value is being provided from local variable to instance variable

        // age = age;
       //(instance variable) = (local variable) => this statement is ambiguous as both have same name. 
       // we presumed that this might be the case but compiler treats both as "local variable", this is called Shadowing Problem
       //* compiler gives preference to local variable
       // to avoid this problem we use 'this' keyword

       this.age = age; // 'this' refers to the current instance of the class
       
       // now this instance variable will accept the value that is being passed while calling the method in main method
       // 'this' keyword is used to refer to the current object of the class
       // this is how we can resolve the shadowing problem
    }

     public void setData2(String name){ // now this local variable will accept the value that is being passed while calling the method in main method

        // name = "Rahul"; // here it is hard coded value

        this.name = name; //
     //(Instance variable) = (local variable)
    
    }

    public void show(){
        System.out.println(name+" "+age);
    }
}

public class studEncap03 {
public static void main(String[]args){
         Student1 obj = new Student1();
         Student1 obj1 = new Student1();

         obj.setData1(18);
         obj1.setData1(25); // without this line obj1 will print default values (null 0)
         
         obj.setData2("Ram");
         obj1.setData2("Navin");// local variable being passed during method call
         // as in obj1 we have not called setData2 method so it will print default value null

         obj.show();
         obj1.show();
    }        
}

// Output:
// Ram 18
// Navin 25