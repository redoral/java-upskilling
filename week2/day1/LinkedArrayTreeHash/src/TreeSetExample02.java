import beans.Employee;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample02 {

    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(new Employee(103, "Red", "Oral", "redmunozoral@gmail.com"));
        employees.add(new Employee(102, "John", "Doe", "johndoe@gmail.com"));
        employees.add(new Employee(101, "Jane", "Doe", "janedoe@gmail.com"));
        employees.add(Employee.parseEmployee("104, Jacob, Kula, jacob@gmail.com"));

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            System.out.println(employee.toCSV());
        }
    }
}
