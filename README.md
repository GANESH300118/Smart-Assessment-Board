# Smart-Assessment-Board

---

# Smart Assessment Board - State Capitals Quiz

This is a simple Java console application designed to help conduct a quiz competition on identifying Indian states and their capitals. The program simulates a quiz environment where the user is prompted to answer questions related to state capitals. The quiz is suitable for classroom activities and quick assessments.

## Features
- Simple command-line interface.
- A predefined list of Indian states and their capitals.
- Automatic score calculation at the end of the quiz.

## Problem Statement
A school teacher needs a model to easily conduct a quiz competition for students to identify the states and capitals of the country. The goal is to provide a tool that supports **Quality Education**.

## How to Use the Application

### Prerequisites
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) installed on your machine.

### Steps to Run the Application
1. Clone the repository or copy the code into a file named `SmartAssessmentBoard.java`.
2. Open your terminal (command prompt) and navigate to the directory containing `SmartAssessmentBoard.java`.
3. Compile the code using:
   ```bash
   javac SmartAssessmentBoard.java
   ```
4. Run the program using:
   ```bash
   java SmartAssessmentBoard
   ```
5. Follow the on-screen prompts to answer the quiz questions.

### Sample Output
```plaintext
Welcome to the State Capitals Quiz!
Identify the capital of the given state.

What is the capital of Andhra Pradesh? Amaravati
Correct!

What is the capital of Bihar? Patna
Correct!

What is the capital of Karnataka? Bengaluru
Correct!

What is the capital of Maharashtra? Pune
Incorrect! The correct answer is: Mumbai

What is the capital of Rajasthan? Jaipur
Correct!

Quiz Over! Your Score: 4 out of 5
```

### Modifying the Quiz Data
You can modify or expand the list of states and capitals by updating the `initializeQuizData()` method within the code. Simply add more entries to the `statesAndCapitals` HashMap like this:
```java
statesAndCapitals.put("State Name", "Capital Name");
```

## Technologies Used
- Java

## Applications
This quiz model can be used in:
- Classroom activities to enhance learning.
- Educational competitions focused on general knowledge.
- Practice exercises for geography-related topics.

## Future Enhancements
- Adding a graphical user interface (GUI) for better interactivity.
- Implementing a timer for each question.
- Expanding the quiz content to include other educational topics.

