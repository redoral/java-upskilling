package beans;

import java.util.Comparator;

public class EmployeeFirstNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2){
        return emp1.getFirstname().compareTo(emp2.getFirstname());
    }
}
