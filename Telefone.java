class Telefone {
    String marka;
    double rozdzielczosc;
    int numer;
    public Telefone(String marka, double rozdzielczosc, int numer){
        this.marka=marka;
        this.rozdzielczosc=rozdzielczosc;
        this.numer=numer;
    }
public String sendsMag(String mag,int numer){
        return "Wysylam wiadomosc"+ mag+" numer "+this.numer;
}
}
