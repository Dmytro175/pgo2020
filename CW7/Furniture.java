package CW7;
class Furniture {
    private static final int Vat_Percentage = 22;
    String name;
    double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public double getPriceIncludingingVat() {
        return getPrice() * Vat_Percentage;
    }
}



