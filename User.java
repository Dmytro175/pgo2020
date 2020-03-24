public class User {
    String imię;
    String nazwisko;
    String e_mail;
    String haslo;
    public User(String imię, String nazwisko, String e_mail, String haslo) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.e_mail = e_mail;
        this.haslo = haslo;
    }
    public String informacja() {
        if (this.e_mail == "Annan@gmail.com" && this.haslo == "anan124") {
            return " jest user ";
        } else {
            return " jest gość";
        }
    }
            public String s(String imię, String nazwisko, String e_mail, String haslo){
                return " imię " + this.imię + " nazwisko " + this.nazwisko + " e_mail" + this.e_mail + " haslo " + this.haslo;
            }
        }
