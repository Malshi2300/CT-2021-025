package Q_02;

abstract public class Pet_2 {
    protected String name;

    public Pet_2 (String name){
        this.name = name;
    }
    public  String getName(){
        return name;
    }
   public String getType(){
        return "Pet";
   }
}
