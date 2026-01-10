package Constructor_07;
class Student1{
    private String name;
    private int age;

    public Student1(){ // 2) control comes here first then goes to this("Rohit",19)

       // super(); // Calling parent class constructor
        // Implicitly added if not written

        this("Rohit", 19); //[2] // 3) now control goes to Parameterized Constructor with 
                                           // two parameters because this() contains two parameters

        System.out.println("Default Constructor is called");
        name = "Rohan";
        age = 18;
    }                  // 6) after this constructor ends control goes back to main method where it had left off

    public Student1(String name){ // 9) control comes here from main method and values are initialized here name="Rahul"

        this(); //[1]    // from here control goes to default constructor because this() has no parameters
        this.name = name;
        age = 19;
    }            // 10) after this constructor ends, control goes back to main method where it had left off
    
    public Student1(String name, int age){ // 4) control comes here from this("Rohit",19) and initializes the values
        this.name = name;
        this.age = age;
    }          // 5) after this constructor ends, control goes back to default constructor where it had left off
    
    
    public void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}
// [1] & [2] are called constructor chaining.
public class thisSuperKeyword_05 {
    public static void main(String[] args){
        Student1 st1 = new Student1(); // 1)control come from main() to this and then it goes to default constructor outside main method
        st1.disp(); // 7) after all constructors are executed control comes back to main method and disp() is called

        Student1 st2 = new Student1("Rahul"); // 8) now control from here goes to parameterized constructor with one parameter
        st2.disp();

        Student1 st3 = new Student1("Rohit", 20);  
        st3.disp();
    }
}

