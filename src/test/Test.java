package test;

import animales.*;

public class Test {
    public static void  main(String[] args){
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Cat p = new Cat();

        d.eat();
        d.walk();
        d.play();

        c.eat();
        c.play();
        System.out.println(c.getName());

        a.eat();
        a.walk();

        e.eat();
        e.walk();

        p.play();
    }
}
