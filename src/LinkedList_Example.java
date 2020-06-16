import java.util.LinkedList;
import java.util.List;

public class LinkedList_Example
{
    public static void main(String[] args) {

        List<Number> numbers = new LinkedList<>();

        for (int i = 1; i <= 10; i +=2) {
            Number number = new Number(" Number:  " + i);
            numbers.add(number);
        }
        for (Number number : numbers){
            System.out.print(number);
        }
        numbers.remove(3);
        System.out.println("\n" + numbers);
    }
}
