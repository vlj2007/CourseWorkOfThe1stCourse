package pro.sky.java.course1.CourseWork;

public class Employee {
    private static int count;
    private final int id;
    public String fullName;
    public String department;
    public double salary;
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
    public static void showEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                System.out.println(employees[i].getId() + "\t " + employees[i].getFullName() + "\t " + employees[i].getDepartment() + "\t " + employees[i].getSalary());
            }
        }
    }
    public static double sumSalary(Employee[] employees){
        double sumSalary = 0;
        for ( Employee employee : employees) {
            if(employee!=null){
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }
    public static double mediumSalary(Employee[] employees) {
        return sumSalary(employees) / 10;
    }
    public static double minSalary(Employee[] employees){
        double minimumSalary = employees[0].salary;
        for ( Employee employee : employees) {
            if(employee!=null){
                if(minimumSalary > employee.getSalary()){
                    minimumSalary = employee.getSalary();
                }
            }
        }
        return minimumSalary;
    }
    public static double maxSalary(Employee[] employees){
        double maximumSalary = employees[0].salary;
        for ( Employee employee : employees) {
            if(employee!=null){
                if(maximumSalary < employee.getSalary()){
                    maximumSalary = employee.getSalary();
                }
            }
        }
        return maximumSalary;
    }
}