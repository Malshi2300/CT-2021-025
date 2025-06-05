package Q_01;

public class Cat extends Pet{
    public String speak(){
        return " ";
    }

    public static void main(String[] args) {
        Cat obj2 = new Cat();
        obj2.setName("juki");
        System.out.println(obj2.speak());
        System.out.println(obj2.getName());
    }

}
