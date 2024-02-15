//        Create a class called Employee that includes three pieces of information as instance variables
//        • a first name (type String)
//        • a last name (type String)
//        • a monthly salary (double)
//        If the monthly salary is not positive, set it to 0.0.
//        Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. Create
//        two Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise
//        and display each Employee’s yearly salary again. Use appropriate methods for this program wherever
//        needed.

public class BasicEmployeeManagement {//BasicEmployeeManagement is same as classEmployeeTest
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ali", "Raza", -5000);
        Employee emp2 = new Employee("Ammar", "Ahmed", 6000);
        System.out.println("Employee 1: " + emp1.getFullName());
        System.out.println("Yearly Salary: $" + emp1.getYearlySalary());
        System.out.println("\nEmployee 2: " + emp2.getFullName());
        System.out.println("Yearly Salary: $" + emp2.getYearlySalary());
        emp1.applyRaise(10);
        emp2.applyRaise(10);
        System.out.println("\nAfter 10% Raise:");
        System.out.println("Employee 1: " + emp1.getFullName());
        System.out.println("Yearly Salary: $" + emp1.getYearlySalary());
        System.out.println("\nEmployee 2: " + emp2.getFullName());
        System.out.println("Yearly Salary: $" + emp2.getYearlySalary());
    }
}
    class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary < 0.0) {
            this.monthlySalary = 0.0;
        } else {
            this.monthlySalary = monthlySalary;
        }
    }
    public double getYearlySalary() {
        return 12 * monthlySalary;
    }
    public void applyRaise(double raisePercentage) {
        if (raisePercentage > 0) {
            double raiseAmount = (raisePercentage / 100) * monthlySalary;
            monthlySalary += raiseAmount;
        }
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
}