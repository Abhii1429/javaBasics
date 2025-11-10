package StaticKeyword;
// Order of execution in java:
// 1. static variable
// 2. static block
//3. static method
//4. Non static variable
//5. non static block
//6. non static method

public class static01 {
   
    static int age; // static variable-1

    static{ /// static block-2
        age = 18;
        System.out.println("Static block first");
        System.out.println(age);
    }

    static void disp(){
        System.out.println("Static disp method main method ke baad jab hum call karenge");
    }
    public static void main(String[] args){ // static method-3
        System.out.println("Main method baad me");
        disp();
    }
}

// Name of variables:
// flag
//temp
//count
//num