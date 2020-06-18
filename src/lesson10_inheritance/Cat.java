package lesson10_inheritance;

public class Cat extends Animal {


    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "I am a Cat " + this.name + this.age;
    }
}