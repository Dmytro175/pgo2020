public class Engine {
        int ilości_koni;
        int rok_produkcji;
        public Engine(int ilości_koni,int rok_produkcji){
            this.ilości_koni=ilości_koni;
            this.rok_produkcji=rok_produkcji;
        }
    public String czy() {
        if (this.ilości_koni < 20000 && this.rok_produkcji > 2000) {
            return "jest ekologiczny ";
        } else {
            return "nie jest ekologiczny";
        }

    }
        public String infa2(int ilości_koni ,int rok_produkcji){
            return "Infa"+" ilości_koni "+this.ilości_koni+" rok_produkcji "+this.rok_produkcji;
        }
    }