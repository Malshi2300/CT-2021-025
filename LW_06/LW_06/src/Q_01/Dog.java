package Q_01;

public class Dog extends Pet {
    public String speak(){
        return " ";
    }
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.setName("Brown");
        System.out.println(obj1.speak());
        System.out.println(obj1.getName());
    }
}
