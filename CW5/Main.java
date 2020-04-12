package CW1;
public class Main {
    public static void main(String[] args) {
        Category c1=new Category("mleko","ss",55);
        Category c2=new Category("jaja","ss", 55);
        Category c3=new Category("chleb","ss",4);
        System.out.println(c1.getNazwa_kategorii());
        System.out.println(c2.getNazwa_kategorii());
        System.out.println(c3.getNazwa_kategorii());
        Koszyk k1=new Koszyk("ss",100);
        System.out.println(k1.getKonto_użytkownika()+" "+k1.getLista_produktów1());
        System.out.println(Koszyk.j());
        System.out.println(Koszyk.czyTeprodukty(c1,k1)+"takie same listy");
    }
}

