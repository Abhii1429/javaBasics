package OOPs_08.inheritance_01;
// Hierarchical Inheritance
class Animal // extends Objects
{            // all the properties of Object class are inherited to Animal class
    void disp(){
        System.out.println("Animal needs sleep");
    }
}

class Tiger extends Animal // extends Objects
                           // all the properties of Object class are inherited to Animal class
{

}
class Monkey extends Animal
{

}
class Deer extends Animal
{

}

public class hierarchicalInheritance_05 {
    public static void main(String[] args){
        Deer d = new Deer();
        d.disp(); 
    }
}

