package animales;

public class Fish extends Animal implements Pet{
    String name;

    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("los peces comen peces");
    }

    @Override
    public void walk(){
        System.out.print("El pez ");
        super.walk();
    }

    @Override
    public String setName(String name) {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("los peces no juegan");
    }
}
