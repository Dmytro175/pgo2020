public class Address {
    private String kraj, miasto, kodPocztowy, ulica, numerMieszkania;
    public String createAddress(String kraj){
        return String.format("Kraj: %s", kraj);
    }

    public String createAddress(String kraj, String miasto) {
        return String.format("Kraj: %s, Miasto: %s", kraj, miasto);
    }

    public String createAddress(String kraj, String miasto, String kodPocztowy) {
        return String.format("Kraj: %s, Miasto: %s, Kod Pocztowy: %s", kraj, miasto, kodPocztowy);
    }

    public String createAddress(String kraj, String miasto, String kodPocztowy, String ulica) {
        return String.format("Kraj: %s, Miasto: %s, Kod Pocztowy: %s, Ulica: %s", kraj, miasto, kodPocztowy, ulica);
    }

    public String createAddress(String kraj, String miasto, String kodPocztowy, String ulica, String numerMieszkania) {
        return String.format("Kraj: %s, Miasto: %s, Kod Pocztowy: %s, Ulica: %s, Numer Mieszkania: %s", kraj, miasto, kodPocztowy, ulica, numerMieszkania);
    }

}
