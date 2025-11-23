package Encapsulation_06;

class Student{
    private int age;
    private String name;
    // private data members can't be accessed directly outside the class
    // private can be accessed only within the same class

    public void setData(){
        age = 18;
        name = "Abhishek";
    }

    public void show(){
        System.out.println(name +" "+age);
    }
}

public class studentEncap01 {
    public static void main(String [] args){
        Student obj = new Student();
        // obj.age = 18; // we can directly access the data members of class Student 
        // to avoid this we use encapsulation(make data members as private)
        // obj.name = "Rahul";
        //after making data members "private" we can't access them directly
        
        obj.setData(); // using public method to set the data
        obj.show();
    }
}
