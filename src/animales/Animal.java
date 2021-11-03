package animales;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk(){
        if(legs == 0){
            System.out.println("no puede caminar porque no tiene patas");
        }else{
            System.out.println("camina sobre sus " + legs + " patas");
        }
    }

}
