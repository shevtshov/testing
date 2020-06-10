package current;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }


    @Override
    public String toString() {
        return "I am Dog, " + this.name + this.age;
    }
}