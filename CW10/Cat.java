package CW10;

public class Cat extends Feline {
    public Cat(String makeNoise) {
        super(makeNoise);
        System.out.println("mau");
    }

    public Cat(String makeNoise, String roam) {
        super( roam);
    }
}
