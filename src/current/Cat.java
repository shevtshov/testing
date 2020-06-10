package current;

public class Cat extends Animal {


    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "I am animal " + this.name + this.age;
    }
}