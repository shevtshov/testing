package lesson10_inheritance;

public class Animal {

    String name;
    int age;

    public static void main(String[] args) {
        System.out.println();
        Cat cat1 = new Cat("CatOne, ", 3);
        System.out.println(cat1.toString());
        Dog dog1 = new Dog("DogOne, ", 6);
        System.out.println(dog1.toString());
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "I am animal ";
    }
}