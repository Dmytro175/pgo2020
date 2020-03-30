public class Koszyk {
    public static final int Limitceny = 100;
    String Lista_produktów1;
    int Konto_użytkownika;

    public Koszyk(String lista_produktów1, int konto_użytkownika) {
        Lista_produktów1 = lista_produktów1;
        Konto_użytkownika = konto_użytkownika;
    }

    public String getLista_produktów1() {
        return Lista_produktów1;
    }

    public void setLista_produktów(String lista_produktów1) {
        Lista_produktów1 = lista_produktów1;
    }

    public int getKonto_użytkownika() {
        return Konto_użytkownika;
    }

    public void setKonto_użytkownika(int konto_użytkownika) {
        Konto_użytkownika = konto_użytkownika;
    }

    public static int j() {
        int[] s = new int[]{20, 10, 15, 25, 5, 22};
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum += s[i];
        }
        if (sum < Limitceny) {
            System.out.println("Zaplacili" + "");
        }
        int k = Limitceny - sum;
        System.out.println(k);
     return sum;
    }

    public static boolean czyTeprodukty(Category c1, Koszyk k1) {
        return c1.Lista_produktów.equals(k1.Lista_produktów1);

    }
}

