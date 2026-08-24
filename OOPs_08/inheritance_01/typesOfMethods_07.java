package OOPs_08.inheritance_01;
// Types of Methods in OOPs-Java:

// 1) Inherited: inherited from the parent class to the child class and are not modified in child class a/c ro child class need. In the above example, CargoPlane and PassengerPlane classes are inheriting the methods of AeroPlane class. So, takeOff() and fly() methods are inherited methods.

// 2) Overridding: redefined in the child class or inherited from parent class and then modified in child class a/c to child class class need. In the above example, if we redefine the takeOff() method in CargoPlane class, then it will be an overridden method.

// 3) Specialized: methods which are only defined in the child class but not in the parent class called as specialized methods. In the above example, carryGoods() method is a specialized method of CargoPlane class and carryPassenger() method is a specialized method of PassengerPlane class.
//--------------------------------------------------------------------

class AeroPlane
{
  public void takeOff(){
    System.out.println("Aeroplane is taking off");
  }
  public void fly(){
    System.out.println("Aeroplane is flying");;
  }
}

class CargoPlane extends AeroPlane{ // "child extends parent" 
  // Evenif nothing is written in the child class, it will inherit all the methods of the parent class i.e. AeroPlane class. So, CargoPlane class will have takeOff() and fly() methods.

  public void fly(){ // overriding method
    System.out.println("cargoplane flies at lower height");
  }

  public void carryGoods(){ // specialized methods
    System.out.println("CargoPlane carries goods");
  }
}

class PassengerPlane extends AeroPlane{ 
  public void fly()
  { // overriding method
    System.out.println("Aeroplane flies at higher height");
  }

  public void carryPassenger(){ // specialized methods
    System.out.println("AeroiPlane carries passengers");
  }
}
//-----------------Main method--------------------------
class typesOfMethods_07 {
  public static void main(String[] args)
  {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly(); 

        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
  }
}
