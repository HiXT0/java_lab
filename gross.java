
interface Gross {
    void calculateGross();
}

class Employee {
    int emp_no;
    String name;
    String department;

    Employee(int emp_no, String name, String department) {
        this.emp_no = emp_no;
        this.name = name;
        this.department = department;
    }

    void displayEmployee() {
        System.out.println("Employee Number: " + emp_no);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Salary extends Employee implements Gross {
    double basic_pay, DA, HRA, gross_salary;

    Salary(int emp_no, String name, String department, double basic_pay) {
        super(emp_no, name, department);
        this.basic_pay = basic_pay;
    }

    public void calculateGross() {
        DA = basic_pay * 0.10;
        HRA = basic_pay * 0.20;
        gross_salary = basic_pay + DA + HRA;
    }

    void displaySalary() {
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Gross Salary: " + gross_salary);
    }

    public static void main(String[] args) {
        Salary s = new Salary(101, "Rahul", "IT", 30000);

        s.calculateGross();

        s.displayEmployee();
        s.displaySalary();
    }
}
