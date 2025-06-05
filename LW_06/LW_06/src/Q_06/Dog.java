package Q_06;

public class Dog extends Pet {
    private double weight;

    public Dog(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return String.format("Name :" + name + " | Weight : " + weight);
    }
}
