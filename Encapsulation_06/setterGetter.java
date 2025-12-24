package Encapsulation_06;

// Example of setter and getter methods
// Setter methods are used to set the value of private variables
// Getter methods are used to get the value of private variables    
// Setter and Getter methods provide controlled access to private variables

class Student{
    private int age; // instance variable
    private String name;

    public void setAge(int age){ // method to set data
        this.age = age;
    } 
    public int getAge(){ // method to get data
        return age;
    } 
   
    public void setName(String name){ // method to set data
        this.name = name;
    }
    public String getName(){ // method to get data
        return name;
    }
}
public class setterGetter {
    public static void main(String[] args){
        Student obj = new Student();
        Student obj1 = new Student();

        obj.setAge( 18);
        obj1.setAge( 25);

        obj.setName("Navin");
        obj1.setName( "Kiran");

        int stud1Age = obj.getAge();
        System.out.println(stud1Age);
    }
}
