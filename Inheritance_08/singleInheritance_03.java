package Inheritance_08;
// single level inheritance
class Animal{
    void sleep(){ //behaviour/method
        System.out.println("Animal need sleep");
    }
}

class Tiger extends Animal{ // Tiger => cild class; Animal => parent class
    
}

public class singleInheritance_03 {
    public static void main(String[] args){
        Tiger t = new Tiger();
        t.sleep(); // tiger class(child) inheriting properties/behaviour of parent class(Animal)
    }
}
