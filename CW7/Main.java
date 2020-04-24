package CW7;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Furniture h1 = new Furniture("Kanapa", 100);
        Furniture h2 = new Furniture("krzesło", 25);
        System.out.println(h1.getPrice());
        System.out.println(h2.getPrice());
        System.out.println(h1.getPriceIncludingingVat());
        System.out.println(h2.getPriceIncludingingVat());

        ArrayList <Furniture> List = new ArrayList<>();
        List.add(h1);
        List.add(h2);

        Room m=new Room("1",20,List);
        Room m1=new Room("2",10,List);
        System.out.println(m.getFurnituresPrice());
        System.out.println(m1.getFurnituresPrice());

        House dom = House.createHouse("Pólawska 22");
        System.out.println("Room_Counter="+dom.getRoom_Counter());
        dom.addRoom(m);
        System.out.println("Room_Counter="+dom.getRoom_Counter());
        ArrayList <Room> List1 = new ArrayList<>();
        List1.add(m);
        List1.add(m1);
        dom.addRoom(List1);
        System.out.println("Room_Counter="+dom.getRoom_Counter());

    }
}
