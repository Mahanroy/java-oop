import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTest {

    // Making Employee class static to access it in the static main method
    public static class Employee {
        private String name;
        private int id;
        private int salary;

        public Employee(String name, int id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public int getSalary() {
            return salary;
        }

        public String toString() {
            return "Employee Name: " + name + ", ID: " + id + ", Salary: $" + salary;
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\nEmployee management: ");
            System.out.println("1. Add employee ");
            System.out.println("2. Remove employee by ID ");
            System.out.println("3. Display all employees ");
            System.out.println("4. Exit ");
            System.out.print("Enter your choice: ");

            // Adding error handling for invalid input
            try {
                choice = input.nextInt();
                input.nextLine();  // Consume the newline

                switch (choice) {
                    case 1:
                        addEmployee(employees, input);
                        break;
                    case 2:
                        removeEmployee(employees, input);
                        break;
                    case 3:
                        displayEmployees(employees);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();  // Clear invalid input
            }
        }
        input.close();
    }

    // Method to add employee
    public static void addEmployee(ArrayList<Employee> employees, Scanner input) {
        System.out.println("Enter employee name: ");
        String name = input.nextLine();
        int id;
        while (true) {
            System.out.println("Enter employee ID: ");
            id = input.nextInt();
            input.nextLine();  // Consume the newline
            if (isUniqueId(employees, id)) {
                break;
            } else {
                System.out.println("Employee ID must be unique. Please enter a different ID.");
            }
        }
        System.out.println("Enter employee salary: ");
        int salary = input.nextInt();
        input.nextLine();  // Consume the newline
        employees.add(new Employee(name, id, salary));
        System.out.println("Employee added.");
    }

    // Method to check if an ID is unique
    public static boolean isUniqueId(ArrayList<Employee> employees, int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return false;
            }
        }
        return true;
    }

    // Method to remove employee by ID
    public static void removeEmployee(ArrayList<Employee> employees, Scanner input) {
        System.out.println("Enter the employee ID to remove: ");
        int id = input.nextInt();
        input.nextLine();  // Consume the newline
        Employee employeeToRemove = null;

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }

        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
            System.out.println("Employee removed.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    // Method to display all employees
    public static void displayEmployees(ArrayList<Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("Displaying all employees:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}
