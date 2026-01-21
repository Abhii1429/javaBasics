package Inheritance_08;

class Demo1{
    void disp(){
        System.out.println("disp written in Demo1 class");
    }
}

class Demo2 extends Demo1{
 // behaviours of Demo1 is inherited by Demo2 class
}

class Demo3 extends Demo2{
  // behaviors of Demo1 is inhereted by Demo3 class via Demo2 class
}
public class multilevelInheritance_04 {
    public static void main(String[] args){
        Demo3 d = new Demo3();
        d.disp(); // calling disp() method of Demo1 class using object of Demo3 class        
    }
}
