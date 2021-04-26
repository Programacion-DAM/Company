package org.iesfm.company.readers;

import org.iesfm.company.Department;
import org.iesfm.company.Employee;

import java.util.Scanner;

public class DepartmentReader implements Reader<Department> {

    private Scanner scanner = new Scanner(System.in);

    private EmployeeReader employeeReader = new EmployeeReader();

    @Override
    public Department read() {
        System.out.println("Introduce el nombre del departamento");
        String name = scanner.nextLine();
        System.out.println("¿Cuántos empleados tiene el departamento?");
        int numEmployees = scanner.nextInt();
        scanner.nextLine();
        Employee[] employees = new Employee[numEmployees];
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Introduce otro empleado:");
            employees[i] = employeeReader.read();
        }
        return new Department(name, employees);
    }
}
