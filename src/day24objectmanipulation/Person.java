package day24objectmanipulation;

public class Person {
    String name;
    String lastname;

    public Person(){
    }

    public Person(String name, String lastname){
        this.name=name;
        this.lastname=lastname;
    }

    public static void main(String[] args) {
        Person person1=new Person();
        System.out.println(person1.name);
        System.out.println(person1.lastname);

        Person person2=new Person("Bilal","Ergin");
        System.out.println(person2.name);
        System.out.println(person2.lastname);
    }


}
