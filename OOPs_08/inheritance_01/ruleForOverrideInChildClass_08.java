package OOPs_08.inheritance_01;
// Rules for overrriding methods in child class:

class Animal{
    public void eat(){
        System.out.println("Animal eats everyday");
    }
    public void age(int x){
        System.out.println("Animal age is");
    }
}

class Tiger extends Animal{
    public void eat(){ // here we are overriding the eat() method of parent class Animal in child class Tiger. So, this is an overridden method.
        System.out.println("Tiger hunts and eat");
    }

    // public int age(){
    //     return 10;
    // }  // while overrriding the method in child class, we cannot change the return type of the overridden method. The return type of the overridden method must be same as the return type of the parent class method.

    public void age(){ // here we are NOT overriding the age() method using concept of method overloading. It is specialized method

    }
}
public class ruleForOverrideInChildClass_08 {
    public static void main(String[] args){
        Tiger t = new Tiger();
        t.eat();
    }
}

// 1.) we cannot change the visibility(access modifier) of the overidden method.
// increasing the visibility of the overridden method is allowed but decreasing the visibility of the overridden method is not allowed. 
// For example: if the parent class method is public, then we can make it protected or private in child class. But if the parent class method is protected, then we cannot make it private in child class.

// 2) we cannot change the return type of the overridden method. The return type of the overridden method must be same as the return type of the parent class method.