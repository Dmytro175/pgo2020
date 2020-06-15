package Cw12;

public class Klient extends User {
    int id;
    private static int NUMER_KLIENTA=0;
    public Klient(String imie, String nazwisko, String id) {
        super(imie, nazwisko);
        NUMER_KLIENTA++;
        this.id = NUMER_KLIENTA;
    }
}


