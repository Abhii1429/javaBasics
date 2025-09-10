public class Test01 {
    int a = 2; // instance variable
    String name = "Rahul"; // instance variable
    public static void main(String[] args){
    // declare a variable
    // create the object
    int num = 9; // Primitive var

    Test01 obj1 = new Test01();// Reference var
    Test01 obj2 = new Test01();

    obj1.name = "Abhishek";
// changing value of one reference car have no impact on another ref var

    System.out.println(obj1.a);
    System.out.println(obj1.name);

    System.out.println(obj2.a);
    System.out.println(obj2.name);
    }
}
 