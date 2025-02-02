
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreating {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the file you want to create");
        String fileCreate = input.next();

        File obj = new File(fileCreate + ".txt");

        try {
            if (!obj.exists()) {  // Check if the file already exists
                if (obj.createNewFile()) {
                    System.out.println("File created successfully: " + obj.getName());
                } else {
                    System.out.println("Failed to create the file.");
                }
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        //writing in the file
        try {
            FileWriter writer = new FileWriter(fileCreate+".txt");
            System.out.println("Enter what you want to write in the file");
            String fileWrite = input.next();

            writer.write(fileWrite);
            writer.close();

        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

        input.close();
    }
}
