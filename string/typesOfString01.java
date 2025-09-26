package string;

public class typesOfString01 {
    public static void main(String[] args){
        String brand = "Great";
        System.out.println(brand);
        brand.concat("Bengaluru"); // immutable
        System.out.println(brand);

        StringBuilder brand1 = new StringBuilder("Great");
        System.out.println(brand1);
        brand1.append("Bengaluru"); // mutable
        System.out.println(brand1);
    }
}
