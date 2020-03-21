public class Airplane {
    String marka;
    int ilość_miejsc;
    public Airplane(String marka,int ilość_miejsc){
        this.marka=marka;
        this.ilość_miejsc=ilość_miejsc;
    }
    public String infa1(String marka ,int ilość_miejsc ){
        return "Infa"+" marka "+this.marka+" ilość_miejsc "+this.ilość_miejsc;
    }

}

