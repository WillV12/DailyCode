/**
 * Class representing a student record with grades.
 * This class demonstrates basic OOP principles and data encapsulation.
 */
public class Student {
    // TODO: Add private fields for studentId, name, grades array, averageGrade, and letterGrade
    private String studentId;
    private String name;
    private int[] grades;
    private double averageGrade;
    private char letterGrade;
    
    /**
     * Constructor to initialize a Student object
     * @param studentId The student's ID
     * @param name The student's name
     * @param grades Array of the student's grades
     */
    public Student(String studentId, String name, int[] grades) {
        // TODO: Initialize fields and calculate average and letter grade
        this.studentId = studentId;
        this.name= name;
        this.grades= grades;
        this.averageGrade = calculateAverage();
        this.letterGrade = determineLetterGrade();
    }
    
    /**
     * Calculates the average of all grades
     * @return The average grade as a double
     */
    private double calculateAverage() {
        // TODO: Calculate and return the average of all grades
        double total = 0.0;
        for(int grade: this.grades){
            total += grade;
        }
        return total/grades.length;
    }
    
    /**
     * Determines the letter grade based on the average
     * @return A character representing the letter grade (A, B, C, D, or F)
     */
    private char determineLetterGrade() {
        // TODO: Return letter grade based on the following scale:
        //       A: 90-100
        //       B: 80-89
        //       C: 70-79
        //       D: 60-69
        //       F: 0-59

        if (this.averageGrade >= 90) return 'A';
        if (this.averageGrade >= 80) return 'B';
        if (this.averageGrade >= 70) return 'C';
        if (this.averageGrade >= 60) return 'D';
        return 'F'; // Placeholder return
    }
    
    // TODO: Implement getters for all fields
    // Hint: Follow standard Java naming conventions for getters (getXxx method names)
    public String getStudentId(){
        return this.studentId;
    }

    public String getName(){
        return this.name;
    }

    public int[] getGrades(){
        return this.grades;
    }

    public double getAverageGrade(){
        return this.averageGrade;
    }

    public char getLetterGrade(){
        return this.letterGrade;
    }
    
    /**
     * Returns a string representation of the student
     * @return String containing all student information
     */
    @Override
    public String toString() {
        // TODO: Return a string representation of the student including:
        //       - ID, name, all grades, average (formatted to 2 decimal places), and letter grade
        // Hint: Use StringBuilder to efficiently build the string as shown in the slides
        // Hint: Use String.format("%.2f", averageGrade) to format the average to 2 decimal places
        StringBuilder output = new StringBuilder("ID: " + this.studentId + "\nName: " + this.name + "\nGrades: "); // Appends student ID, Name
        // Appends all grades for the int[], grade
        output.append("\n");
        for (int grade: this.grades){
            output.append("    ").append(grade).append("\n");
        }
        output.append("\nAverage Grade: ").append(String.format("%2f", this.averageGrade)); // Appends average grade
        output.append("\nLetter Grade: ").append(this.letterGrade); // Appends letter grade

        return output.toString(); // Converts the StringBuilder into a String type
    }
}