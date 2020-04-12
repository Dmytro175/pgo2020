import java.math.BigDecimal;
public class Main4 {
    public static void main(String[] args) {
        Multiplier m1=new Multiplier();
        System.out.println(m1.multiply(3,4));
        System.out.println(m1.multiply(3,4,2,10));
        System.out.println(m1.multiply(3.5,2.5));

        BigDecimal a1=new BigDecimal(1238.25);
        BigDecimal a2=new BigDecimal(1272.55);
        System.out.println(a1.multiply(a2));

        Adder adder=new Adder();
        System.out.println(adder.add(7,4));
        System.out.println(a1.add(a2));

        Address address1 = new Address();
        System.out.println(address1.createAddress("Polska", "Warszawa","000-01","Modzelewskiego 37", "5"));

    }
}

