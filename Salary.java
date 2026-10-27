class Employee {
    private int emp_no;
    private String name;
    private String department;
    private double basic_pay;
    private double DA;
    private double HRA;
    private double gross_salary;

    private static String companyName = "Tech Solutions Pvt. Ltd.";

    // Constructor
    Employee(int emp_no, String name, String department, double basic_pay) {
        this.emp_no = emp_no;
        this.name = name;
        this.department = department;
        this.basic_pay = basic_pay;

        DA = basic_pay * 0.10;
        HRA = basic_pay * 0.20;
        gross_salary = basic_pay + DA + HRA;
    }

    // Display employee details
    void display() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Number: " + emp_no);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Gross Salary: " + gross_salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Arna", "IT", 30000);
        Employee e2 = new Employee(102, "Pritam", "HR", 40000);
        Employee e3 = new Employee(103, "Prateek", "Finance", 35000);
        Employee e4 = new Employee(104, "Mani", "Marketing", 50000);
        Employee e5 = new Employee(105, "Mandal", "Operations", 45000);

        Employee highest = e1;

        if (e2.gross_salary > highest.gross_salary)
            highest = e2;
        if (e3.gross_salary > highest.gross_salary)
            highest = e3;
        if (e4.gross_salary > highest.gross_salary)
            highest = e4;
        if (e5.gross_salary > highest.gross_salary)
            highest = e5;

        System.out.println("Employee with Highest Gross Salary:");
        highest.display();
    }
}
