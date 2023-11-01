package passgen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PassStorage {
        public static void storage(String fileName, int length){
            String outputFileName = fileName + ".txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName, true))) {
                String password = PassGenerator.passGen(length);
                writer.write(password);
                writer.newLine();
                System.out.println("Passwords saved to " + outputFileName);
            } catch (IOException e) {
                e.printStackTrace();
            }   
        }
}
