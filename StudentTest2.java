import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest2{

    // Define the Student class
    public static class Student {
        private String name;
        private int rollNumber;
        private int grade;

        // Constructor
        public Student(String name, int rollNumber, int grade) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        // Getters
        public String getName() {
            return name;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public int getGrade() {
            return grade;
        }

        // Override toString method to display student details
        @Override
        public String toString() {
            return "Student Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();  // Store Student objects instead of employees
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\nStudent management: ");
            System.out.println("1. Add student ");
            System.out.println("2. Remove student by index ");
            System.out.println("3. Display all students ");
            System.out.println("4. Exit ");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();  // Consume the newline

            if (choice == 1) {
                System.out.println("Enter student name: ");
                String name = input.nextLine();
                System.out.println("Enter student roll number: ");
                int rollNumber = input.nextInt();
                System.out.println("Enter student grade: ");
                int grade = input.nextInt();
                students.add(new Student(name, rollNumber, grade));
                System.out.println("Student added.");
            } 
            else if (choice == 2) {
                System.out.println("Enter the index of the student to remove: ");
                int indexOfRemove = input.nextInt();
                if (indexOfRemove >= 0 && indexOfRemove < students.size()) {
                    students.remove(indexOfRemove);
                    System.out.println("Student removed.");
                } else {
                    System.out.println("Invalid index.");
                }
            } 
            else if (choice == 3) {
                System.out.println("Displaying all students:");
                for (Student student : students) {
                    System.out.println(student);
                }
            } 
            else if (choice == 4) {
                System.out.println("Exiting...");
            } 
            else {
                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}
