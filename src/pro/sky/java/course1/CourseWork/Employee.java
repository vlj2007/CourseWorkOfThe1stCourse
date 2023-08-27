package pro.sky.java.course1.CourseWork;

import java.util.Objects;

public class Employee {
    private static int count;
    private final int id;
    private String fullName;
    private String department;
    private double salary;

    public Employee(String fullName, String department, double salary) {
        count++;
        this.id = count;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return this.fullName;
    }

    /**
     * @param employees Метод showEmployee выводит список всех сотрудников.
     */
    public static void showEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getId() + "\t " + employees[i].getFullName() + "\t " + employees[i].getDepartment() + "\t " + employees[i].getSalary());
            }
        }
    }

    /**
     * @param employees Метод sumSalary возвращает сумму затрат на ЗП в месяц.
     * @return
     */
    public static double sumSalary(Employee[] employees) {
        double sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }

    /**
     * @param employees Метод numberOfNonNullArrayValues проходит по массиву сотрудников и возвращает не null записи.
     * @return
     */
    public static int numberOfNonNullArrayValues(Employee[] employees) {
        int notNull = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                notNull++;
            }
        }
        return notNull;
    }

    /**
     * @param employees Метод mediumSalary возвращает сред. зарплаты.
     * @return
     */
    public static double mediumSalary(Employee[] employees) {
        return sumSalary(employees) / numberOfNonNullArrayValues(employees);
    }

    /**
     * @param employees Метод minSalary возвращает минимальную зарплату
     * @return
     */
    public static double minSalary(Employee[] employees) {
        double minimumSalary = employees[0].salary;
        for (Employee employee : employees) {
            if (employee != null) {
                if (minimumSalary > employee.getSalary()) {
                    minimumSalary = employee.getSalary();
                }
            }
        }
        return minimumSalary;
    }

    /**
     * @param employees Метод maxSalary возвращает максимальныю зарплату
     * @return
     */
    public static double maxSalary(Employee[] employees) {
        double maximumSalary = employees[0].salary;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maximumSalary < employee.getSalary()) {
                    maximumSalary = employee.getSalary();
                }
            }
        }
        return maximumSalary;
    }

}