package StaticKeyword;

class Demo{
    static void disp1(){
        System.out.println("Static disp1");
    }

    void disp2(){
        System.out.println("Non static disp2");
    }
}
public class static2 {
    public static void main(String[]args){
        Demo.disp1();
    }
}
