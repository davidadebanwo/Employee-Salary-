package General;

public class Employee {
    String name;
    double salary;
    double bonus;

    public Employee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }


    public double getTotalSalary() {
        return salary + bonus;
    }

    public String allinfo() {
        return "Name: " + name + ", Salary: $" + salary + ", Bonus: $" + bonus + ", Total Salary: $" + getTotalSalary();
    }
}