package CW1;
public class Category {
        String Nazwa_kategorii, Lista_produktów;
        private int cena;

        public Category(String nazwa_kategorii, String lista_produktów, int cena) {
            this.Nazwa_kategorii = nazwa_kategorii;
            this.Lista_produktów = lista_produktów;
            this.cena = cena;
        }

        public String getNazwa_kategorii() {
            return Nazwa_kategorii;
        }

        public void setNazwa_kategorii(String nazwa_kategorii) {
            Nazwa_kategorii = nazwa_kategorii;
        }

        public String getLista_produktów() {
            return Lista_produktów;
        }

        public void setLista_produktów(String lista_produktów) {
            Lista_produktów = lista_produktów;
        }

        public int getcena() {
            return cena;
        }

        public void setcena(int cena) {
            cena = cena;
        }


    }

