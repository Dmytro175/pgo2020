package CW10;
public class Main {
    public static void main(String[] args){
        Lion l=new Lion("");
        Cat l2=new Cat("");
        Wolf l3=new Wolf("");
        Dog l4=new Dog("");
        System.out.println(l+" "+l2+" "+l3+" "+l4);

        /*Feline k=new Feline("");
        Canine j=new Canine("");
        System.out.println(k+" "+j);
         */
      Car g=new Car(4);
      g.start();
      g.stop();
    }
}
