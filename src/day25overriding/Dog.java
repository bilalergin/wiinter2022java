package day25overriding;

public class Dog extends Mammal {
    @Override
    public void eat() {
        System.out.println("Dogs eat");
    }
    public void bark(){
        System.out.println("Dogs bark");

    }


}
