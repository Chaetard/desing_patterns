package main.java.factorymethod;



public class TestFactory {

    public static void main(String[] args) {

        Enemy warrior = new WarriorFactory().createEnemy();

        warrior.atack();

    }


}
