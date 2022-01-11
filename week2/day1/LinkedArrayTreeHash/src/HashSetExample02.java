import beans.Employee;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample02 {

    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee(101, "John", "Doe", "johndoe@gmail.com"));
        employees.add(new Employee(102, "Jane", "Doe", "janedoe@gmail.com"));
        employees.add(new Employee(103, "Red", "Oral", "redmunozoral@gmail.com"));
        employees.add(new Employee(104, "Idont", "Know", "idk@gmail.com"));
        employees.add(Employee.parseEmployee("105, Imran, Ilyas, thedon@gmail.com"));
        Employee emp106 = new Employee(106, "Jacob", "Kula", "jkula@gmail.com");
        employees.add(emp106);

        System.out.println("Hashcode "+ new Employee(107, "Red", "Oral", "redmunozoral@gmail.com").hashCode());
        System.out.println("Hashcode "+ new Employee(107, "Red", "Oral", "redmunozoral@gmail.com").hashCode());

        Iterator<Employee> employeeIterator = employees.iterator();
        while(employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            System.out.println(employee.toCSV());
        }
    }
}
