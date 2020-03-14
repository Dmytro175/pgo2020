public class Main {
    public static void main(String[] args) {
   /* Telefone phone1=new Telefone("samsung",13, 380934008);
    Telefone phone2=new Telefone("iphone",14,345267819);
    System.out.println(phone1.sendsMag(" Okej",phone2.numer));
    System.out.println(phone2.sendsMag(" Fajnie",phone1.numer));
    */

    Car k1=new Car("lamborgini","zólty",254);
    Car k2=new Car(" Ferari "," czerwony ",244);
    System.out.println(k1.infaCar(" Zajebisty",k2.marka,k2.kolorz,k2.pojemnościsilnika));
    System.out.println(k2.infaCar(" Fajny",k1.marka,k1.kolorz,k1.pojemnościsilnika));
    }


}
