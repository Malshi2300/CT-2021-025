package Q_05;

public class Pet {
    private String name ;

    public Pet(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return "Pet";
    }
}
