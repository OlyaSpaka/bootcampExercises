package module6;


public class InheritanceActivity {

    public static void main(String[] args) {

        // Create Person object p. Write code to and set name of Person as Sarah Johnson
        // and age as 21
        Person p = new Person("Sarah Johnson", 21);

        System.out.println("-----------------------------");
        //Create Employee object e and
        // set salary as 70000, title as Developer, age as 32 and name as Shawn Cun
        Employee e = new Employee("Shawn Cun", 32, 70000, "Developer");

        // Print Info using Employee object
        System.out.println("-----------------------------");
        System.out.println("Employee's Name is   : " + e.getName());
        System.out.println("Employee's Age is    : " + e.getAge());
        System.out.println("Employee's Title is  : " + e.getTitle());
        System.out.println("Employee's Salary is : " + e.getSalary());


        // Print Info using Person object
        System.out.println("-----------------------------");
        System.out.println("Person's Name is    : " + p.getName());
        System.out.println("Person's Age is     : " + p.getAge());


    }

}

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Employee extends Person {
    private int salary;
    private String title;

    Employee(String name, int age, int salary, String title) {
        super(name, age);
        this.salary = salary;
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public String getTitle() {
        return title;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
