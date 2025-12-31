import java.io.FileWriter;
import java.io.IOException;
public class mediumLevel {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("medium.txt");
            writer.write("5*12=? , 60 \n");
            writer.write("How many sides does a triangle have? , 3 \n");
            writer.write("What is H2O? , Water \n");
            writer.write("What planet is known as the Red Planet? , Mars \n");
            writer.write("What is the capital of Japan?, Tokyo \n");
            writer.write("What is the smallest prime number?,2 \n");
            writer.write("What is the capital of Turkey ?, Ankara \n");
            writer.write("What color are bananas?,Yellow\n");
            writer.write("What is the square of 10? ,100 \n");
            writer.write("9+5*3=? , 24 \n");
            writer.write("How many hours in one day ?, 24\n");
            writer.write("What month comes after April ?,May \n");
            writer.write("What color is the grass?,Green \n");
            writer.write("10-7=? ,3 \n ");
            writer.write("What is 12+15=?,27 \n");
            writer.close();
            System.out.println("medium.txt file created successfully!");
        }
        catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
}
