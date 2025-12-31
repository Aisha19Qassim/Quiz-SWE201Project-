import java.io.FileWriter;
import java.io.IOException;
public class hardLevel {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("hard.txt");
            writer.write("What organ controls the human body? , Brain \n");
            writer.write("How many bones in the adult human body? ,206 \n");
            writer.write("What gas do humans breathe in?,O2\n");
            writer.write("What color do you get when you mix blue and yellow?,Green \n");
            writer.write("How many sides does a rectangle have?,4 \n");
            writer.write("What is the chemical formula for table salt?,NaCl \n");
            writer.write("Who discovered gravity?, Newton \n");
            writer.write("How many Emirates in UAE? , 7 \n");
            writer.write("What Day comes after Monday? , Tuesday \n");
            writer.write("How many planets are in the solar system?,8 \n");
            writer.write("500+1000-9=? , 1491 \n");
            writer.write("What is the chemical symbol for silver?,Ag \n");
            writer.write("What is the most spoken language in the world?,English \n");
            writer.write("What is the chemical symbol for gold?,Au \n");
            writer.write("What is the square root of 144?,12 \n");
            writer.close();
            System.out.println("hard.txt file created successfully!");
        }
        catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
}
