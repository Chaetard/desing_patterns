package main.java.factorymethod;

public class Warrior implements Enemy {


    @Override
    public void atack() {
        System.out.println("warrior atack in factory method");
    }
}
