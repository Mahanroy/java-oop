import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentTest2 {
    
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

    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Student Management System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new BorderLayout());

            JTextArea studentDisplay = new JTextArea();
            studentDisplay.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(studentDisplay);
            frame.add(scrollPane, BorderLayout.CENTER);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(5, 2));

            JTextField nameField = new JTextField();
            JTextField rollNumberField = new JTextField();
            JTextField gradeField = new JTextField();
            JTextField removeIndexField = new JTextField();

            panel.add(new JLabel("Student Name:"));
            panel.add(nameField);
            panel.add(new JLabel("Roll Number:"));
            panel.add(rollNumberField);
            panel.add(new JLabel("Grade:"));
            panel.add(gradeField);
            panel.add(new JLabel("Index to Remove:"));
            panel.add(removeIndexField);

            JButton addButton = new JButton("Add Student");
            JButton removeButton = new JButton("Remove Student");
            JButton displayButton = new JButton("Display Students");

            panel.add(addButton);
            panel.add(removeButton);
            panel.add(displayButton);

            frame.add(panel, BorderLayout.SOUTH);

            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = nameField.getText();
                    int rollNumber;
                    int grade;
                    try {
                        rollNumber = Integer.parseInt(rollNumberField.getText());
                        grade = Integer.parseInt(gradeField.getText());
                        students.add(new Student(name, rollNumber, grade));
                        studentDisplay.setText("Student added.");
                    } catch (NumberFormatException ex) {
                        studentDisplay.setText("Please enter valid roll number and grade.");
                    }
                }
            });

            removeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int index;
                    try {
                        index = Integer.parseInt(removeIndexField.getText());
                        if (index >= 0 && index < students.size()) {
                            students.remove(index);
                            studentDisplay.setText("Student removed.");
                        } else {
                            studentDisplay.setText("Invalid index.");
                        }
                    } catch (NumberFormatException ex) {
                        studentDisplay.setText("Please enter a valid index.");
                    }
                }
            });

            displayButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    StringBuilder displayText = new StringBuilder("Displaying all students:\n");
                    for (Student student : students) {
                        displayText.append(student).append("\n");
                    }
                    studentDisplay.setText(displayText.toString());
                }
            });

            frame.setVisible(true);
        });
    }
}
