package CW2;
public class Produkt {
    String nazwa;
    int cena;
    int kod;
    int liczba;
    public Produkt(String nazwa,int cena,int kod,int liczba){
        this.nazwa=nazwa;
        this.cena=cena;
        this.kod=kod;
        this.liczba=liczba;
    }
    public String k(String nazwa,int cena,int kod,int liczba ) {
        return " nazwa " + this.nazwa + " cena " + this.cena + " kod " + this.kod+" liczba "+this.liczba;
    }
}

