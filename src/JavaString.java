public class JavaString {

    public static void main(String[] args) {
        String firstStr = "String Example";
        System.out.println(firstStr.charAt(4)); // Finding characters;

        System.out.println(firstStr.indexOf("Example")); // Finding substring;

        System.out.println(firstStr.length()); // Determine String Length

        System.out.println(firstStr.substring(firstStr.length() - 7)); // Extracting substring;


    }
}