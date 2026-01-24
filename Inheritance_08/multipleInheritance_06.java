package Inheritance_08;
//Multiple Inheritance
// it is not supported in java to avoid ambiguity
// it is supported in c++
// it is also known as diamond shape problem

class Parent1 // extends Object
{              // whenever we dont't use "extends" keyword, it automatically extends "Object" class (which is present in java.lang package); 
               // it is included by default and is a inbuilt class in java.
    int age = 18;
}

class Parent2 // extends Object
{
    int age = 19;
}
 
// class Child extends Parent1, Parent2{ // this will give compile time error 
class Child extends Parent1 //, extends Parent2 // there is no support for multiple inheritance in java
{
   void disp(){
         System.out.println("Age is: " + age); 
   }
}


public class multipleInheritance_06 {
    public static void main(String[] args){
        Child c = new Child();
        c.disp(); 
    }
}
