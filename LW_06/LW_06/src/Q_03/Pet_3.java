package Q_03;

abstract  public class Pet_3 {
    protected String name;

    public Pet_3 (String name){
        this.name = name;
    }
    public  String getName(){
        return name;
    }
    public String getType(){
        return "Pet";
    }
}
