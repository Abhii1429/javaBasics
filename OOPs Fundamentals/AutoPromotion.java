class Calci{
    public void show(byte num){
        System.out.println("byte " + num);
    }
    public void show(short num){
        System.out.println("short " + num);
    }
    public void show(char num){
        System.out.println("char " + num);
    }
    public void show(int num){
        System.out.println("int " + num);
    }
    public void show(long num){
        System.out.println("long " + num);
    }
    public void show(float num){
        System.out.println("float " + num);
    }
    public void show(double num){
        System.out.println("double " + num);
    }
}
public class AutoPromotion {
    public static void main(String[] args){
        Calci obj = new Calci();
        // byte b= 5;
        obj.show('p');
        // char is presented in single quote 'p' like this; double quotes means it's string and string is not auto promoted
    }
}
