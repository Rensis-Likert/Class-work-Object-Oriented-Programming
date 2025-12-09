# Student Grade Report System

## Overview
This Java program generates a complete **Student Grade Report** for a class of twelve students. It serves as a console-based management tool that collects basic school information, reads student scores across multiple subjects, calculates totals and letter grades, and outputs a formatted report with class statistics.

---

## Features

### 1. School Information Input
The program initializes by prompting the user for the following context:
* **School Name**
* **Teacher's Name**
* **Grade Level**
* **School Year**

### 2. Student Data Collection
For each of the **12 students**, the system records:
* Student Name
* **Subject Scores:**
    * English
    * Math
    * History
    * Geography
    * Science
    * Programming

### 3. Automated Calculations
The program computes the **Total Score** for each student and assigns a letter grade based on specific thresholds.

**Grading Logic Table**

| Grade | Total Score Requirement |
| :---: | :--- |
| **A** | Score $\ge$ 540 |
| **B** | Score $\ge$ 480 |
| **C** | Score $\ge$ 420 |
| **D** | Score $\ge$ 360 |
| **F** | Score $<$ 360 |

### 4. Class Statistics
The system aggregates data to provide:
* Total score for each subject.
* Average score for each subject.
* Overall average total score.
* **Grade Distribution:** A count of how many students received A's, B's, C's, D's, and F's.

### 5. Formatted Output
The final report is displayed clearly in the console, featuring:
* A School Information Header.
* A structured table of student scores, totals, and grades.
* Subject totals and class averages.
* A summary of the grade distribution.

---

## Program Flow

1.  **Initialization:** Collect school and teacher details.
2.  **Input Loop:** Iterate through 12 students to input names and scores for 6 subjects.
3.  **Processing:** Calculate individual totals and determine letter grades.
4.  **Aggregation:** Compute subject totals and class-wide averages.
5.  **Output:** Display the formatted report table and statistics.
6.  **Termination:** Close input scanners and exit.

---

## Technical Details

### Requirements
* **Java 8** or higher.
* Any Java-compatible IDE or editor (e.g., VS Code, IntelliJ, Eclipse).

### Core Concepts Demonstrated
This project is designed to demonstrate practical applications of Java fundamentals:
* **Arrays:** For storing structured data (names, scores).
* **Loops:** For repetitive data entry and processing.
* **Conditional Statements:** For implementing the grading logic (If/Else).
* **Formatted Output:** Using `System.out.printf` for table alignment.

---

## How to Run

1.  **Save the file:**
    Ensure your code is saved as `Main.java`.

2.  **Compile the program:**
    Open your terminal or command prompt and run:
    ```bash
    javac Main.java
    ```

3.  **Run the program:**
    Execute the compiled class file:
    ```bash
    java Main
    ```