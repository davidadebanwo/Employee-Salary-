package General;


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 50000.0, 3000.0);
        Employee employee2 = new Employee("Jane Smith", 60000.0, 2000.0);
        Employee employee3 = new Employee("Bob Johnson", 70000.0, 5000.0);

        System.out.println(employee1.name);
        System.out.println(employee1.salary);
        System.out.println(employee1.bonus);
        System.out.println(employee1.allinfo());

        System.out.println(employee2.name);
        System.out.println(employee2.salary);
        System.out.println(employee2.bonus);
        System.out.println(employee2.allinfo());

        System.out.println(employee3.name);
        System.out.println(employee3.salary);
        System.out.println(employee3.bonus);
        System.out.println(employee3.allinfo());
    }
}

