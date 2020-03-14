public class Car {
    String marka;
    String kolorz;
    int pojemnościsilnika;
    public Car(String marka, String kolorz,  int pojemnościsilnika){
        this.marka=marka;
        this.kolorz=kolorz;
        this.pojemnościsilnika = pojemnościsilnika;
    }
    public String infaCar(String infa,String marka,String kolorz ,int pojemnościsilnika ){
        return "Infa"+ infa+" marka "+this.marka+" kolorz "+this.kolorz+" pojemnośisilnika "+this.pojemnościsilnika;
    }

    }


