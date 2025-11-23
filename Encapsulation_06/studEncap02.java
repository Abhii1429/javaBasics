package Encapsulation_06;

class Student{
    private int age;
    private String name;

    public void setData(){ // method to set data
        name = "Ram";
        age = 22;
    }
    
    public void show(){
        System.out.println(name+" "+age);
    }
}
public class studEncap02 {
    public static void main(String[]args){
        Student obj = new Student();

        Student obj1 = new Student();

        obj.setData();
        obj1.setData(); // without this line obj1 will print default values (null 0)

        obj.show();
        obj1.show(); // it will print the values set by setData() method
        // but setData() doesn't allow us to set different values for different objects
        // for that we need to modify setData() method to accept parameters
    }
}


