package OOPs_08.inheritance_01;

// single level inheritance
class Animal1{
    void sleep(){ //behaviour/method
        System.out.println("Animal need sleep");
    }
}

class Tiger extends Animal1{ // Tiger => cild class; Animal => parent class
    
}

public class singleInheritance_03 {
    public static void main(String[] args){
        Tiger t = new Tiger();
        t.sleep(); // tiger class(child) inheriting properties/behaviour of parent class(Animal)
    }
}