package CW7;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Room {
    private String name;
    private double capasity;
    private ArrayList<Furniture> furnitures;

    public Room (String name,double capasity,ArrayList<Furniture>furnitures){
        this.name=name;
        this.capasity=capasity;
        this.furnitures=furnitures;
    }

    public double getFurnituresPrice(){
        int i; double h=0;
        for (i=0; i<this.furnitures.size(); i++){
            h=h+this.furnitures.get(i).getPriceIncludingingVat();

        }
        return h;

    }
}
