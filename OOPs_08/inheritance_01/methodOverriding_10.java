package OOPs_08.inheritance_01;
// method overriding in inheritance

// polymorphism => one name many forms/ one is to many; code size get reduced => code resuability
class AeroPlane1{

    public void takeoff(){

        System.out.println("AeroPlane is taking off");
    }

    public void fly(){

        System.out.println("AeroPlane is flying");
    }
}

class CargoPlane1 extends AeroPlane1{

    public void takeoff(){
        System.out.println("CargoPlane requires longer runway");
    }

    public void fly(){
        System.out.println("CargoPlane flies at lowe height");
    }
}

class PassengerPlane1 extends AeroPlane1{
    public void takeoff(){
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly(){
        System.out.println("PassengerPlane flies at medium height");
    }
}
public class methodOverriding_10 {
    public static void main(String[] args){
        CargoPlane1 cp = new CargoPlane1();
        cp.takeoff();
        cp.fly();

        PassengerPlane1 pp = new PassengerPlane1();
        pp.takeoff();
        pp.fly();
        // pp = cp; // siblings cannot be assigned to each other but parent can be assigned to child and child can be assigned to parent.

        AeroPlane1 ref;
        
        ref = cp;
        
        ref.takeoff();
        ref.fly();

        System.out.println("---------------------");

        ref = pp;

        ref.takeoff();
        ref.fly();
        }
}
