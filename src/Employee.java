import java.util.Objects;

public class Employee {
    private final String fio;

    private int department;
    private float salary;
    private int id;
    private static int idSequence;


    public Employee(String fio, int department, float salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = ++idSequence;
    }


    public String getFio() {
        return this.fio;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        if (department < 0 || department > 5) {
            throw new IllegalArgumentException(" не верно указан отдел");
        }
        this.department = department;

    }

    public void setSalary(float salary) {
        if (salary < 0) {
            throw new IllegalArgumentException(" не может быть меньше 0");
        }
        this.salary = salary;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return
                " id=" + id +
                " ФИО='" + fio + '\'' +
                ", Отдел=" + department +
                ", Зарплата=" + salary;
    }
}










