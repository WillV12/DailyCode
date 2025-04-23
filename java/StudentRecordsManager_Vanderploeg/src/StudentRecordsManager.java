// This works in intelliJ. VsCode is being stupid and says it can't find the main class in this file :(
// The code only worked when I put the absolute path in for the file name, even when they are in the same folder

import java.io.*;
import java.util.*;

/**
 * Main class that manages student records.
 * This class demonstrates file I/O and exception handling in Java.
 * 
 * The StudentRecordsManager handles:
 * - Reading student data from CSV files
 * - Processing and validating the data
 * - Calculating statistics
 * - Writing formatted results to output files
 * - Proper exception handling throughout the process
 */
public class StudentRecordsManager {
    
    /**
     * Main method to run the program.
     * Handles user input and delegates processing to other methods.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        StudentRecordsManager manager = new StudentRecordsManager();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter input filename: ");
        String inputFile = scanner.nextLine();
        
        System.out.print("Enter output filename: ");
        String outputFile = scanner.nextLine();
        
        try {
            /**
             * TODO: Call the processStudentRecords method with appropriate parameters
             * 
             * This should pass the inputFile and outputFile variables to the method
             */
            manager.processStudentRecords(inputFile, outputFile);

        } catch (Exception e) {
            /**
             * TODO: Handle general exceptions
             * 
             * - Display a user-friendly error message
             * - Include the exception's message for debugging purposes
             * - Consider using System.err instead of System.out for error messages
             */
        } finally {
            /**
             * The scanner is closed in the finally block to ensure resources are
             * properly released regardless of whether an exception occurred.
             * This demonstrates proper resource management.
             */
            scanner.close();
        }
    }
    
    /**
     * Process student records from an input file and write results to an output file.
     * This method orchestrates the entire data processing workflow.
     * 
     * @param inputFile Path to the input file containing student records
     * @param outputFile Path to the output file where results will be written
     */
    public void processStudentRecords(String inputFile, String outputFile) {
        try {
            /**
             * TODO: Call readStudentRecords and writeResultsToFile methods
             * 
             * 1. Call readStudentRecords to get a list of Student objects
             * 2. Call writeResultsToFile to output the processed data
             * 3. Print a success message to the console
             */
            writeResultsToFile(readStudentRecords(inputFile), outputFile);
            System.out.println("Student records successfully processed");

        } catch (FileNotFoundException e) {
            /**
             * TODO: Handle file not found exception
             * 
             * Provide a clear message indicating which file couldn't be found
             * and possibly suggest solutions (check spelling, path, etc.)
             */
            System.out.println("ERROR:" + e.getMessage() + "\nCheck spelling and path");
        } catch (IOException e) {
            /**
             * TODO: Handle general I/O exceptions
             * 
             * These could be permission issues, disk full, etc.
             * Provide helpful information about the nature of the I/O problem.
             */
            System.out.println("ERROR:" + e.getMessage() + "\nEnsure the program has permission to read/write\n" +
                    "Make sure you have enough disk space");

        }
    }
    
    /**
     * Read student records from a file and convert them to Student objects.
     * This method demonstrates file reading operations and exception handling.
     * 
     * @param filename Path to the input file
     * @return List of Student objects created from the file data
     * @throws IOException If an I/O error occurs during file reading
     */

    public List<Student> readStudentRecords(String filename) throws IOException {
        List<Student> students = new ArrayList<>();
        int lineNum = 0;
        try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
            while (file.ready()) {
            lineNum++;
            String line = file.readLine();
            String[] data = line.split(",");
            int[] grades = new int[4];
            for (int i=2, k = 0; i<data.length; i++, k++) {
                if (Integer.parseInt(data[i]) > 100.0 || Integer.parseInt(data[i]) < 0.0) {
                throw new InvalidGradeException("Grade is out of range");
            } else {
                grades[k] = Integer.parseInt(data[i]);
            }
            }
            Student student = new Student(data[0], data[1], grades);
            students.add(student);
            }
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Number cannot be parsed as an integer. Please enter an integer");
             } catch (InvalidGradeException e) {
                System.out.println("Inputted grade is out of range, file line: " + lineNum);
             } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("line " + lineNum +  "of the file has too few fields :(");


 }

 /**
          * TODO: Implement using try-with-resources to read the file
          *
          * 1. Create a BufferedReader wrapped around a FileReader
          * 2. Read each line of the file
          * 3. For each line, parse the student data:
          * - Split the line by commas
          * - Extract studentId (parts[0]) and name (parts[1])
          * - Parse the four grade values (parts[2] through parts[5])
          * 4. Create a Student object with the parsed data
          * 5. Add the Student object to the students list
          *
          * Remember to handle these specific exceptions:
          * - NumberFormatException: When a grade cannot be parsed as an integer
          * - InvalidGradeException: When a grade is outside the valid range (0-100)
          * - ArrayIndexOutOfBoundsException: When a line has too few fields
          *
          * For each exception, provide clear error messages that include the line number
          * where the error occurred for easier debugging.
          */


    return students;
    }


    /**
     * Write processed student results to an output file.
     * This method demonstrates file writing operations.
     * 
     * @param students List of Student objects to be written to the file
     * @param filename Path to the output file
     * @throws IOException If an I/O error occurs during file writing
     */
    public void writeResultsToFile(List<Student> students, String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            // Write header
            writer.println("Class Results Summary");
            writer.println("=====================");

            // Write student information
            for (Student student : students) {
                writer.println(student.toString());
            }

            // Initialize counters and sum
            int totalStudents = students.size();
            int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
            double totalGrade = 0.0;

            for (Student student : students) {

                    double grade = student.getAverageGrade();
                    totalGrade += grade;


                    if (grade >= 90) countA++;
                    else if (grade >= 80) countB++;
                    else if (grade >= 70) countC++;
                    else if (grade >= 60) countD++;
                    else countF++;

            }

            double average = totalStudents > 0 ? totalGrade / totalStudents : 0;

            // Write statistics
            writer.println();
            writer.println("Class Statistics");
            writer.println("----------------");
            writer.println("Total Students: " + totalStudents);
            writer.printf("Class Average: %.2f%n", average);
            writer.println("Grade Distribution:");
            writer.println("A: " + countA);
            writer.println("B: " + countB);
            writer.println("C: " + countC);
            writer.println("D: " + countD);
            writer.println("F: " + countF);
        }
    }

}