package Q_04;

public class Bicycle {

    private Owner owner;

    public Bicycle() {
        this.owner = new Owner();  // Assign default owner
    }

    public Bicycle(String name, String num) {
        this.owner = new Owner(name, num);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void displayBicycleInfo() {
        System.out.println("Bicycle Details: ");
        System.out.println(owner.toString());
    }
}
