package Constructor_07;
class Student{
    // Data members or variables or fields or instance variables
    private String name;
    private int age;
     // Setter methods:
    public void setName(String name){ //3.) parameter receives the value that is sent from object
        this.name = name; //4.) then this parameter value is assigned to instance variable using 'this' keyword
    }
    public void setAge(int age){ //3.) parameter receives the value that is sent from object
        this.age = age; //4.) then this parameter value is assigned to instance variable using 'this' keyword
       
        // 5.) now the name and age variable is initialized with values sent from object
        // this initialization is done in the latter stage after object creation(memory allocation and default value assignment)
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class basics_01 {
    public static void main(String[] args){
       Student st = new Student(); // object creation
       //1.) for object, a memory area will be allocated on heap memory and memory area for variables(name & age) of this class(Student) will be created inside memory area of object
       // default values will be assigned to those variables(null for String and 0 for int).
       // And reference of that memory area will be stored in variable 'st' which is created on stack memory
       
       st.setName("Rahul");
       st.setAge(10);
       //2.) a value is set through setter methods and that is recieved by parameter of setter methods and assigned to instance variables using 'this' keyword
       
       String name = st.getName();
       System.out.println(name);
     //    System.out.println(st.getName());
     int age = st.getAge();
     System.out.println(age);
    }
}

// If we have to do the initialization of instance variables at the time of object creation itself then use of constructor comes into the picture

