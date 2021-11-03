package animales;

public class Cat extends Animal implements Pet{
    String name;

    public Cat(String name) {
        super(4);
        this.name = name;

    }

    public Cat(){
        this("");
    }

    @Override
    public void eat() {
        System.out.println("Los gatos comen whiskas");
    }

    @Override
    public void walk(){
        System.out.print("El gato ");
        super.walk();
    }

    @Override
    public String setName(String name) {
        return name;
    }

    @Override
    public String getName() {
        return "El nombre del gato es " + name;
    }

    @Override
    public void play() {
        System.out.println("El gato esta jugando con una pelota");
    }
}
