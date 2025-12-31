import java.io.FileWriter;
import java.io.IOException;
public class easyLevel {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("easy.txt");
            writer.write("55+23 = ? , 78 \n");
            writer.write("What is The capital of the UAE ? , AbuDhabi \n");
            writer.write("What color is the sky ?, Blue\n");
            writer.write("How many days are in a week ?, 7 \n");
            writer.write("What is The capital of France ? , Paris\n");
            writer.write("66-32 ? , 34 \n");
            writer.write("How many letters are in the English alphabet? , 26\n");
            writer.write("What is 55 / 11 ? , 5 \n");
            writer.write("Which month has 28 days? , February\n");
            writer.write("What is the unit of the current? , Ampere \n");
            writer.write("What is the opposite of Cold?, Hot \n");
            writer.write("What is the boiling point of water in Celsius? , 100 \n");
            writer.write("What is the square root of 16?, 4 \n");
            writer.write("What is the next number after 99? , 100 \n");
            writer.write("What is 15 % 4 ?, 3 \n");
            writer.close();
            System.out.println("easy.txt file created successfully!");
        }
        catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
}
