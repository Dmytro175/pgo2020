package Cw12;

public class Pracownik extends User {
    String id;
    public static int NUMER_PRACOWNIKA=0;
    public Pracownik(String imie, String nazwisko,String id) {
        super(imie, nazwisko);
        NUMER_PRACOWNIKA++;
        this.id=id;
    }

    public String getIdPracownik() {
        return id;
    }

    public Klient createKlient (String imie, String nazwisko){
        Klient klient = new Klient(imie,nazwisko, id);
        return klient;
    }

    public BankAccount createBankAccount (Klient klient){
        BankAccount account = new BankAccount();
        return account;
    }
}
