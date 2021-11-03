package animales;

public class Spider extends Animal{


    public Spider() {
        super( 8 );
    }

    @Override
    public void eat() {
        System.out.println("las arañas comen insectos pequeños");
    }

    @Override
    public void walk() {
        System.out.print("la araña ");
        super.walk();
    }
}
