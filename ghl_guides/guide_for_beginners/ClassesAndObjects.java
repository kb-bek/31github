package ghl_guide;


public class ClassesAndObjects {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "Richard";
        p1.age = 32;

        System.out.println("I'm " + p1.name + ". I'm " + p1.age);

        p1.speak();
        p1.run();
        p1.eat();
    }
}


class Person {
    String name;
    int age;

    public void speak(){
        System.out.println("I am speaking");
    }

    public void run() {
        System.out.println("I am running");
    }

    public void eat() {
        System.out.println("I am eating");
    }
}