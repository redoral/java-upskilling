import beans.Employee;
import beans.EmployeeFirstNameComparator;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample03 {
    public static void main(String[] args) {
        EmployeeFirstNameComparator employeeFirstNameComparator = new EmployeeFirstNameComparator();
        TreeSet<Employee> employees = new TreeSet<>(employeeFirstNameComparator);
        employees.add(new Employee(103, "Red", "Oral", "redmunozoral@gmail.com"));
        employees.add(new Employee(102, "John", "Doe", "johndoe@gmail.com"));
        employees.add(new Employee(101, "Jane", "Doe", "janedoe@gmail.com"));
        employees.add(Employee.parseEmployee("104, John, Doe, johndoe2@gmail.com"));

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            System.out.println(employee);
        }
    }
}
