package module6;

public class Employee extends Person {
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
