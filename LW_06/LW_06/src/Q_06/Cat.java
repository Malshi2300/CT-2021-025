package Q_06;


public class Cat extends Pet {
    private String coatColor;

    public Cat(String name, String coatColor) {
        super(name);
        this.coatColor = coatColor;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public String toString() {
        return String.format("Name : " + name + " | Coat color : " + coatColor);
    }
}
