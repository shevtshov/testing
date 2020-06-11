import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileManager {

    public static void main(String[] args) throws IOException {

        File file = new File("./Test.txt");


        System.out.println("Menu: ");
        System.out.println("1. Create empty file");
        System.out.println("2. Delete file");
        System.out.println("3. List of files in the current directory");
        System.out.println("4. Rename file");
        System.out.println("5. Path to the current directory");
        System.out.println("6. Exit");
        int n;
        String filePath = new File(".").getCanonicalPath();
        do {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.println("File created: " + createEmptyFile(file));
                    break;
                case 2:
                    System.out.println("File deleted: " + deleteFile(file));
                    break;
                case 3:
                    System.out.println("List of files in the directory: " + Arrays.toString(listOfFiles(new File(filePath))));
                    break;
                case 4:
                    System.out.printf("File renamed to 'Example.txt': %s%n", renameTo(file));
                break;
                    case 5:
                    System.out.println("Path to the directory with file: " + pathToDirectory(new File(pathToDirectory(new File(filePath)))));
            }

        } while (n != 6);
    }


    public static boolean createEmptyFile(File file) {
        try {
            return file.createNewFile();
        } catch (IOException fileExist) {
            return false;
        }

    }

    public static boolean deleteFile(File file) {
        return file.delete();
    }

    public static String[] listOfFiles(File file) {
        return file.list();
    }
    public static boolean renameTo(File file){
        return file.renameTo(new File("./Example.txt"));
    }
    public static String pathToDirectory(File file){
        return file.getPath();
    }
}