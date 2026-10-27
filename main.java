//Create a class called Employee. Employee has three private data members name, department and salary. Initialize these data member via constructor. Display all the information for 5 employee of same company. Also display name of their company. Use static member concept to implement this code
class Employee {
    // Private data members
    private String name;
    private String department;
    private double salary;

    // Static data member shared by all employees
    private static String companyName = "Tech Solutions Pvt. Ltd.";

    // Constructor
    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee information
    void display() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Creating five employee objects
        Employee e1 = new Employee("Pritam", "HR", 35000);
        Employee e2 = new Employee("Arna", "Finance", 40000);
        Employee e3 = new Employee("Prateek", "IT", 45000);
        Employee e4 = new Employee("Mani", "Marketing", 38000);
        Employee e5 = new Employee("Mandal", "Operations", 50000);

        // Displaying employee information
        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}
