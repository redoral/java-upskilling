import beans.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample02 {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(103, "Red", "Oral", "redmunozoral@gmail.com"));
        employees.add(new Employee(102, "John", "Doe", "johndoe@gmail.com"));
        employees.add(new Employee(101, "Jane", "Doe", "janedoe@gmail.com"));
        employees.add(Employee.parseEmployee("104, Jacob, Kula, jacob@gmail.com"));

        Iterator<Employee> employeeIterator = employees.iterator();
        while(employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            System.out.println(employee.toCSV());
        }

    }
}
