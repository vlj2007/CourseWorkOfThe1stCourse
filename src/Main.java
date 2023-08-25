import pro.sky.java.course1.CourseWork.Counter;
import pro.sky.java.course1.CourseWork.Employee;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        myApp();
    }
    public static void myApp() {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Musk Elon Reeve", "1", 1_000_456.00);
        employees[1] = new Employee("Spears Britney Jean", "2", 4_500.00);
        employees[2] = new Employee("Mapother IV Thomas Cruise", "1", 4_500.00);
        employees[3] = new Employee("Voight Angelina Jolie", "4", 44_500.00);
        employees[4] = new Employee("Charles Keanu Reeves", "5", 500.00);
        employees[5] = new Employee("Wilhelm Leonardo DiCaprio", "3", 488_500.00);
        employees[6] = new Employee("Laura Winona Horowitz", "2", 4500.00);
        employees[7] = new Employee("Spears Britney Jean", "2", 4577.00);
        employees[8] = new Employee("Spears Britney Jean", "1", 4500.00);
        employees[8].setSalary(600.00);
        employees[8].setDepartment("4");
        employees[9] = new Employee("Spears Britney Jean", "1", 4500.00);
        //отображаем массив
        Employee.showEmployee(employees);
        //Отображаем сумму зарплат
        Employee.sumSalary(employees);
        Employee.mediumSalary(employees);
        Employee.minSalary(employees);
        Employee.maxSalary(employees);
        System.out.println("Сумму затрат на зарплаты в месяц -- " + Employee.sumSalary(employees));
        System.out.println("Cреднее значение зарплат -- " + " " + Employee.mediumSalary(employees));
        System.out.println("Cотрудник с минимальной зарплатой -- "+ Employee.minSalary(employees));
        System.out.println("Cотрудника с максимальной зарплатой -- " + Employee.maxSalary(employees));
    }
}