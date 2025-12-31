//Aisha Omer Qassem
//1099168
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;  //This one imports everything inside the java.util not only Scanner

public class QuizGame_V1 {
    public static void main(String[] args) {
        String tryAgain;
        // start the quiz (next it will ask use to continue or not)
        do {
            // ## welcome message and choosing quiz level
            Scanner input = new Scanner(System.in);
            getMenue();
            String fileName = getFile();
            // ## store the questions and the answers in arrays
            String[] fileQuestions = new String[15];
            String[] fileAnswers = new String[15];//this list stores the correct fileAnswers  that match the fileQuestions.
            try {
                Scanner fileReader = new Scanner(new File(fileName)); //we’re using it to read from a file,not a user
                int lineIndex = 0;
                while (fileReader.hasNextLine()) { //reeds all the Q and A in the file till the end
                    String line = fileReader.nextLine().trim();
                    if (line.contains(",")) { // separate question and answer,We only want to process lines that follow the correct format~
                        String[] parts = line.split(",", 2);
                        fileQuestions[lineIndex] = parts[0].trim();
                        fileAnswers[lineIndex] = parts[1].trim();
                        lineIndex++;
                    }
                }
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }

            // let's start the quiz!!!!
            System.out.println();
            System.out.println("Welcome to my Quiz Game");
            System.out.println("You will get 10 questions in the quiz, don't cheat, Let's start\n");

            // create new array to select 10 random questions from the fileQuestion Arrays,
            // so I create two new arrays called
            int index;
            String[] finalQuestions = new String[10];
            String[] finalAnswers = new String[10];

            int numberOfQuestions = 0;
            while (numberOfQuestions < 10) {
                index = (int) (Math.random() * fileQuestions.length); // 0 - 14

                String questionToAdd = fileQuestions[index];
                String answerToAdd = fileAnswers[index];

                if (checkUniqueness(finalQuestions, questionToAdd)) {
                    finalQuestions[numberOfQuestions] = questionToAdd;
                    finalAnswers[numberOfQuestions] = answerToAdd;
                    numberOfQuestions++;
                }

            }
            int score = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println("Questions" + (i + 1) + ": " + finalQuestions[i]);
                System.out.print("Your answer: ");
                String userAnswer = input.nextLine().trim();
                if (userAnswer.equalsIgnoreCase(finalAnswers[i])) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Wrong The right answer is: " + finalAnswers[i] + "\n");
                }
            }
            // display final score
            System.out.println("Quiz finished!");
            System.out.println("Your score is: " + score + "/10 in the "
                    + fileName.replace(".txt", " level"));
            System.out.println("=====================================================================================");
            System.out.println("If you want to try again print Yes\n");
            tryAgain = input.nextLine();
        } while (tryAgain.equalsIgnoreCase("Yes"));
        System.out.println("Program Stopped ");
        System.exit(0);
    }

    //methods used here*****
    public static void getMenue() {
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("Choose any level:");
        System.out.println("1.Easy");
        System.out.println("2.Medium");
        System.out.println("3.Hard");
    }

    public static String getFile() {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter your choice 1-3:");
            n = input.nextInt();
            if (n != 1 && n != 2 && n != 3) {
                System.out.println("Invalid choice, try again");
            }
        } while (n != 1 && n != 2 && n != 3);

        String fileName = " ";
        switch (n) {
            case 1:
                fileName = "easy.txt";
                break;
            case 2:
                fileName = "medium.txt";
                break;
            case 3:
                fileName = "hard.txt";
                break;
            default:
                System.out.println("No fetched file!! :(");
                break;
        }
        return fileName;
    }

    public static boolean checkUniqueness(String[] finalQuestions, String questinToAdd) {
        for (int i = 0; i < finalQuestions.length; i++) {
            if (questinToAdd.equals(finalQuestions[i]))
                return false;
        }
        return true;
        }
}
