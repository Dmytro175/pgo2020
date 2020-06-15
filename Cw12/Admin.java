package Cw12;
import java.util.ArrayList;
public class Admin extends Pracownik{
    private ArrayList<Pracownik> listaPracowników=new ArrayList<>();
    public Admin(String imie, String nazwisko, String id) {
        super(imie, nazwisko, id);
    }

    public void dodajPracownika(Pracownik p){
    this.listaPracowników.add(p);
 }
    public void usunPracownika(){
        for(int i=0; i<this.listaPracowników.size(); i++){
            Pracownik t=this.listaPracowników.get(i);
           Pracownik p = null;
            if(t.getIdPracownik().equals(p.getIdPracownik())) {
                this.listaPracowników.remove(t);
            }
        }

    }

}
