package pl.akademiakodu.zad4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz Kolacz on 15.03.2017.
 */
public class Company {


    public void addEmployee(){

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Adam", "Kaczmarek", 1980, 20));
        employeeList.add(new Employee("Maciej", "Strach", 1989, 10));
        employeeList.add(new Employee("Paulina", "Starosielec", 1990, 5));

        System.out.println("Lista Pracowników: ");

        for (Employee employee : employeeList) {
            employee.Show();
        }
    }
}
