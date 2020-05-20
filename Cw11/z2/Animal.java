package Cw11.z2;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getType();

    public String getName() {
        return name;
    }

}
