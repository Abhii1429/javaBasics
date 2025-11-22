package StaticKeyword;
import java.util.Scanner;
// application for farmer loan
class Farmer {
    int pa; // principal amout
    float td; // time duration
    // float roi; // rate of interest
    static float roi; // rate of interest

    float si; // simple interest

    static // static block
    {
        roi = 8.5f; // initializing static variable
    }

    // activities
    void input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please mention the amout required: ");
        pa = scan.nextInt();
        
        System.out.println("Please mention the time duration: ");
        td = scan.nextFloat();
        // roi = 8.5f; // rate of interest 
    }
    // calculation
    void compute()
    {
        si = (pa * td * roi) / 100;
    }
    void disp()
    {
        System.out.println("SI is :"+ si);
    }
}

public class launchFarmer03{
    public static void main(String[] args){
        Farmer f1 = new Farmer();
        f1.input();
        f1.compute();
        f1.disp();
        Farmer f2 = new Farmer();
        f2.input();
        f2.compute();
        f2.disp();
    }
}

// static keyword is used there when we have to share a common copy of data amoong all the objects of class.
// here rate of interest is common for all the farmers so we can declare it as static.
// in this case we can declare roi as static variable. so that only one copy of roi will be created in the memory.
// when we declare a variable as static then it will be loaded into the memory only once at the time of class loading.
// to access static variable we can use class name as well as object name. but recommended way is to use class name.
// in this case we can access roi variable by Farmer.roi;
// after making roi as static we can remove its initialization from input method and can initialize it directly in the class body. 

