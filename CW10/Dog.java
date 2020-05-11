package CW10;

public class Dog extends Canine {
    public Dog(String makeNoise) {
        super(makeNoise);
        System.out.println("gaw");
    }

    public Dog(String makeNoise, String roam) {
        super(roam);
    }
}
