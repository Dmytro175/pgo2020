package CW2;
public class Main {
    public static void main(String[] args) {
        User persona1 =new User("Anna","Tomasz","Annan@gmail.com","anan124" );
        System.out.println(persona1.s("Anna","Tomasz","Annan@gmail.com","anan124"));
        System.out.println(persona1.informacja());

        User persona2 =new User("Dmytro","Tomasz","ddd@gmail.com","ddd124" );
        System.out.println(persona2.s("Dmytro","Tomasz","ddd@gmail.com","ddd124"));
        System.out.println(persona2.informacja());

        Produkt sklep=new Produkt("Mango",32,1234234521,1);
        System.out.println(sklep.k("Mango",32,1234234521,1));

        Produkt sklep1=new Produkt("Ananas",14,1234456734,5);
        System.out.println(sklep1.k("Ananas",14,1234456734,5));

        Produkt sklep2=new Produkt("Mandaryna",12,123423424,2);
        System.out.println(sklep2.k("Mandaryna",12,122132131,2));

    }
}

