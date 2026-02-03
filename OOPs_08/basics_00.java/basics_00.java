class Addition
{
    int a, b, c; // instance variable / object var./ properties/ field var.
    // instance var => the place where variables are declared will decide which kind of variable it is.
    void add()
    {
        a = 10; 
        b = 20;
        c = a + b;
        System.out.println(c);
    }
}

public class basics_00 {
    public static void main(String[] args) {
        Addition ad = new Addition(); // instanciation => object creation
         // ad => reference variable
        ad.add();
    }
}
