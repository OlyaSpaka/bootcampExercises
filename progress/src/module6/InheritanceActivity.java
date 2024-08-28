package module6;

public class InheritanceActivity {

    public static void main(String[] args) {
        Person p = new Person("Sarah Johnson", 21);

        Employee e = new Employee("Shawn Cun", 32, 70000, "Developer");

        System.out.println("-----------------------------");
        System.out.println("Employee's Name is   : " + e.getName());
        System.out.println("Employee's Age is    : " + e.getAge());
        System.out.println("Employee's Title is  : " + e.getTitle());
        System.out.println("Employee's Salary is : " + e.getSalary());

        System.out.println("-----------------------------");
        System.out.println("Person's Name is    : " + p.getName());
        System.out.println("Person's Age is     : " + p.getAge());
    }
}