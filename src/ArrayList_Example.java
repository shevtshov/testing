import java.util.ArrayList;
import java.util.List;

public class ArrayList_Example
{
    public static void main(String[] args) {

        List<Number> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i +=2) {
            Number number = new Number(" Number:  " + i);
            numbers.add(number);
        }
        for (Number number : numbers){
            System.out.print(number + " ");
        }
        numbers.remove(3);
        System.out.println("\n" + numbers);
    }
}
