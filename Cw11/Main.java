package Cw11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>(10);
        cars.add(new Car(2000, "Ford"));
        cars.add(new Car(2001, "Toyota"));
        cars.add(new Car(2002, "Nissan"));
        cars.add(new Car(2003, "Porsche"));
        cars.add(new Car(2004, "Audi"));
        cars.add(new Car(2005, "Hyundai"));
        cars.add(new Car(2006, "Volkswagen"));
        cars.add(new Car(2007, "Honda"));
        cars.add(new Car(2008, "BMW"));
        cars.add(new Car(2009, "Mercedes-Benz"));

        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(cars);
        }
        ArrayList<Item> items = new ArrayList<>(5);
        items.add(new Item("sdsa", "Ford"));
        items.add(new Item("sadad", "Ford"));
        items.add(new Item("wewdas", "Ford"));
        items.add(new Item("wewdas", "Ford"));
        items.add(new Item("wewdas", "Ford"));

        Collections.sort(items);
        for (Item item : items) {
            System.out.println(items);
        }
        HashMap<String,Item> mapa=new HashMap<>(){
            for(Item item : items) {
               mapa.put(item.getId(),item);
            }
        }
        Iterable<? extends Map.Entry<Integer, String>>entrySet;
        for(Map.Entry<Integer, String> entry: entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
        ArrayList<Item> item = new ArrayList<>(10);
        items.add(new Item("wewdas", "Ford"));
        items.add(new Item("wewdas", "Ford"));
        items.add(new Item("wewdas", "Ford"));
        items.add(new Item("wewdas", "Ford"));
        items.add(new Item("wewdas", "Ford"));
        List<Item>myItemsSublist= myItemsSublist.subList(0,5);
        Set<Item>itemSet=new HashSet<>(myItemsSublist);
    }
    public static int readNumber() throws NNEx{
        System.out.println("Numer");
        Scanner scanner=new Scanner(System.in);
        int value = scanner.nextInt();
        if (value<0){
            throw new NNEx("Bląd");
        }
     return value;
    }
}




