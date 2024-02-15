//        An organization keeps a record of all the managers that are part of their organization.
//        1. The organization stores basic personal details such as the employee number, employee
//        name, employee phone number and employee salary (private).
//        2. Create Accessor and Mutator for the private member variables.
//        3. The details such as the employee number, employee name, employee phone number,
//        and salary are required as an input.
//        4. Display the details for three employees along with the employee with the highest
//        salary.
import java.util.Scanner;
public class EmployeeManagementWithPrivateAttributes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int maxEmployees = s.nextInt();
        s.nextLine();
        EmployeeRecord[] arr = new EmployeeRecord[maxEmployees];
        int currentEmployeeCount = 0;
        while (currentEmployeeCount < maxEmployees) {
            EmployeeRecord emp = new EmployeeRecord();
            System.out.print("Enter employee number (or -1 to exit): ");
            int empNumber = s.nextInt();
            if (empNumber == -1) {
                break;
            }
            emp.setEmployeeNumber(empNumber);
            s.nextLine();
            System.out.print("Enter employee name: ");
            String empName = s.nextLine();
            emp.setEmployeeName(empName);
            System.out.print("Enter employee phone number: ");
            String empPhone = s.nextLine();
            emp.setEmployeePhoneNumber(empPhone);
            System.out.print("Enter employee salary: ");
            double empSalary = s.nextDouble();
            emp.setEmployeeSalary(empSalary);
            s.nextLine();
            arr[currentEmployeeCount] = emp;
            currentEmployeeCount++;
        }
        if (currentEmployeeCount == 0) {
            System.out.println("No employees entered.");
        } else {
            EmployeeRecord highestSalaryEmployee = findEmployeeWithHighestSalary(arr, currentEmployeeCount);
            System.out.println("\nEmployee Details:");
            for (int i = 0; i < currentEmployeeCount; i++) {
                System.out.println("Employee Number: " + arr[i].getEmployeeNumber());
                System.out.println("Employee Name: " + arr[i].getEmployeeName());
                System.out.println("Employee Phone Number: " + arr[i].getEmployeePhoneNumber());
                System.out.println("Employee Salary: " + arr[i].getEmployeeSalary());
                System.out.println();
            }
            System.out.println("Employee with the Highest Salary:");
            System.out.println("Employee Number: " + highestSalaryEmployee.getEmployeeNumber());
            System.out.println("Employee Name: " + highestSalaryEmployee.getEmployeeName());
            System.out.println("Employee Phone Number: " + highestSalaryEmployee.getEmployeePhoneNumber());
            System.out.println("Employee Salary: " + highestSalaryEmployee.getEmployeeSalary());
        }
    }
    public static EmployeeRecord findEmployeeWithHighestSalary(EmployeeRecord[] employees, int count) {
        EmployeeRecord highestSalaryEmployee = employees[0];
        for (int i = 1; i < count; i++) {
            if (employees[i].getEmployeeSalary() > highestSalaryEmployee.getEmployeeSalary()) {
                highestSalaryEmployee = employees[i];
            }
        }
        return highestSalaryEmployee;
    }
}
    class EmployeeRecord {
        private int employeeNumber;
        private String employeeName;
        private String employeePhoneNumber;
        private double employeeSalary;
        public int getEmployeeNumber() {
            return employeeNumber;
        }
        public String getEmployeeName() {
            return employeeName;
        }
        public String getEmployeePhoneNumber() {
            return employeePhoneNumber;
        }
        public double getEmployeeSalary() {
            return employeeSalary;
        }
        public void setEmployeeNumber(int employeeNumber) {
            this.employeeNumber = employeeNumber;
        }
        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }
        public void setEmployeePhoneNumber(String employeePhoneNumber) {
            this.employeePhoneNumber = employeePhoneNumber;
        }
        public void setEmployeeSalary(double employeeSalary) {
            this.employeeSalary = employeeSalary;
        }
    }