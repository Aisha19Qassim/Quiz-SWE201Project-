# Java Console Quiz Game

A simple, interactive console-based **Java Quiz Game** that features multiple difficulty levels, random question selection, and persistent score tracking.

---

## 🎮 Features

* **Difficulty Levels:** Choose between Easy, Medium, and Hard modes.
* **Randomized Questions:** Each session selects 10 unique, random questions from a pool of 15 per level.
* **Automatic File Generation:** Includes helper classes to generate the question database (`.txt` files) automatically.
* **Score Tracking:** Displays your final score and the level completed at the end of each round.
* **Replayability:** Option to restart the game immediately after finishing.

---

## 🚀 How to Run

### 1. Generate the Question Files

Before running the game, you must generate the text files containing the questions. Compile and run these three files:

* `easyLevel.java`
* `mediumLevel.java`
* `hardLevel.java`

### 2. Start the Game

Compile and run the main game file:

```bash
javac QuizGame_V1.java
java QuizGame_V1

```

---

## 📂 Project Structure

| File | Description |
| --- | --- |
| `QuizGame_V1.java` | The core game engine (handles logic, scoring, and UI). |
| `easyLevel.java` | Generates `easy.txt` with basic math and general knowledge. |
| `mediumLevel.java` | Generates `medium.txt` with intermediate questions. |
| `hardLevel.java` | Generates `hard.txt` with science and advanced trivia. |

---

## 🛠️ Technical Snippets

The game uses a `do-while` loop to keep the session active and a `checkUniqueness` method to ensure no duplicate questions appear in a single round:

```java
public static boolean checkUniqueness(String[] finalQuestions, String questinToAdd) {
    for (int i = 0; i < finalQuestions.length; i++) {
        if (questinToAdd.equals(finalQuestions[i]))
            return false;
    }
    return true;
}

```

---

**Developed by:** Aisha Omer Qassem
**Celebrating my first project** 


