import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //We use scanner class that comes within  java utilities thus we import it.
        //So then we create a scanner object "report" to help us store inputs received from the keyboard
        Scanner report = new Scanner(System.in);

        // --- 1. INPUT SCHOOL DETAILS ---
        //So we write a prompt to ask user to write their school details
        System.out.println("Enter school name:");
        String schoolName = report .nextLine();
        //He will continue responding to the other prompts while they are being stored in their respective variables

        System.out.println("Enter Teacher's name:");
        String teacherName = report.nextLine();

        System.out.println("Enter Grade:");
        String grade = report.nextLine();

        System.out.println("Enter Year:");
        int year = report.nextInt();
        report.nextLine();

        //------2------INPUTTING STUDENT RECORDS
        //We create a constant,to make work easier for the "For loop" condition, Array size declaration and overally to make our work easier.
        final int NUM_STUDENTS = 12;
        //So the program automatically expects 12 students

        // Arrays for storing student data
        String[] studentName = new String[NUM_STUDENTS];
        double[] english = new double[NUM_STUDENTS];
        double[] math = new double[NUM_STUDENTS];
        double[] history = new double[NUM_STUDENTS];
        double[] geography = new double[NUM_STUDENTS];
        double[] science = new double[NUM_STUDENTS];
        double[] programming = new double[NUM_STUDENTS];
        double[] total = new double[NUM_STUDENTS];
        char[] gradeLetter = new char[NUM_STUDENTS];
        // Each array stores one type of information

        /* Using a for loop, The program repeats the following steps 12 times:
        1. Ask for the students name
        2. Ask for the scores in all six subjects
        3. Calculate the student's total score immediately
        4. Store values in their respective in their respective arrays
         */
        for (int index = 0; index < NUM_STUDENTS; index++) {
            System.out.println("\n--- Student " + (index+1) + " ---");
            System.out.print("Enter Student name: ");
            studentName[index] = report.nextLine();

            System.out.print("Enter English score: ");
            english[index] = report.nextDouble();

            System.out.print("Enter Math score: ");
            math[index] = report.nextDouble();

            System.out.print("Enter History score: ");
            history[index] = report.nextDouble();

            System.out.print("Enter Geography score: ");
            geography[index] = report.nextDouble();

            System.out.print("Enter Science score: ");
            science[index] = report.nextDouble();

            System.out.print("Enter Programming score: ");
            programming[index] = report.nextDouble();

            report.nextLine(); // clear leftover newline after numbers

            // Calculate student total immediately
            total[index] = english[index] + math[index] + history[index] + geography[index] + science[index] + programming[index];
        }

        // --- 3. CALCULATE RANKS & CLASS STATS ---
        //
        double totalEnglish = 0, totalMath = 0, totalHistory = 0, totalGeography = 0, totalScience = 0, totalProgramming = 0;
        double grandTotalScore = 0; // The sum of all students' total scores

        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        for (int index = 0; index < NUM_STUDENTS; index++) {
            // Determine Rank
            if (total[index] >= 540.0) gradeLetter[index] = 'A';
            else if (total[index] >= 480.0) gradeLetter[index] = 'B';
            else if (total[index] >= 420.0) gradeLetter[index] = 'C';
            else if (total[index] >= 360.0) gradeLetter[index] = 'D';
            else gradeLetter[index] = 'F';

            // Count Ranks
            switch (gradeLetter[index]) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
                case 'F': countF++; break;
            }

            // Sum columns for class totals
            totalEnglish += english[index];
            totalMath += math[index];
            totalHistory += history[index];
            totalGeography += geography[index];
            totalScience += science[index];
            totalProgramming += programming[index];
            grandTotalScore += total[index];
        }

        // Calculate Averages
        double avgEnglish = totalEnglish / NUM_STUDENTS;
        double avgMath = totalMath / NUM_STUDENTS;
        double avgHistory = totalHistory / NUM_STUDENTS;
        double avgGeography = totalGeography / NUM_STUDENTS;
        double avgScience = totalScience / NUM_STUDENTS;
        double avgProgramming = totalProgramming / NUM_STUDENTS;
        double avgTotal = grandTotalScore / NUM_STUDENTS;

        // --- 4. PRINT THE REPORT CARD (MATCHING THE IMAGE) ---

        System.out.println("\n\n"); // Spacing before report
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.printf("%50s %s\n", "School Name:", schoolName);
        System.out.printf("%50s %s\n", "Teacher:", teacherName);
        System.out.printf("%50s %s\n", "Grade:", grade);
        System.out.printf("%50s %d\n", "Year:", year);
        System.out.println("=========================================================================================================");

        // Header Row
        System.out.printf("%-20s %9s %9s %9s %9s %9s %12s %9s %5s\n",
                "Student Name", "English", "Math", "History", "Geography", "Science", "Programming", "Total", "Rank");

        System.out.println("=========================================================================================================");

        // Student Rows
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.printf("%-20s %9.2f %9.2f %9.2f %9.2f %9.2f %12.2f %9.2f %4c\n",
                    studentName[i], english[i], math[i], history[i], geography[i], science[i], programming[i], total[i], gradeLetter[i]);
        }

        System.out.println("---------------------------------------------------------------------------------------------------------");

        // Totals Row
        System.out.printf("%-20s %9.2f %9.2f %9.2f %9.2f %9.2f %12.2f %9.2f\n",
                "TOTALS:", totalEnglish, totalMath, totalHistory, totalGeography, totalScience, totalProgramming, grandTotalScore);

        System.out.println("---------------------------------------------------------------------------------------------------------");

        // Averages Row
        System.out.printf("%-20s %9.2f %9.2f %9.2f %9.2f %9.2f %12.2f %9.2f\n",
                "AVERAGES:", avgEnglish, avgMath, avgHistory, avgGeography, avgScience, avgProgramming, avgTotal);

        System.out.println("=========================================================================================================");

        // Ranks Summary
        System.out.printf("Ranks      A's: %d      B's: %d      C's: %d      D's: %d      F's: %d\n",
                countA, countB, countC, countD, countF);

        System.out.println("=========================================================================================================");

        report.close();
    }
}



