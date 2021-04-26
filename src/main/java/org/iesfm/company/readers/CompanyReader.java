package org.iesfm.company.readers;

import org.iesfm.company.Company;
import org.iesfm.company.Department;

import java.util.Scanner;

public class CompanyReader implements Reader<Company> {

    private Scanner scanner = new Scanner(System.in);

    private DepartmentReader departmentReader = new DepartmentReader();

    @Override
    public Company read() {
        System.out.println("Introduce el nombre de la empresa");
        String name = scanner.nextLine();
        System.out.println("Introduce el CIF");
        String cif = scanner.nextLine();
        System.out.println("¿Cuántos departamentos hay?");
        int numDepartments = scanner.nextInt();
        scanner.nextLine();
        Department[] departments = new Department[numDepartments];
        for (int i = 0; i < departments.length; i++) {
            System.out.println("Introduce nuevo departamento: ");
            departments[i] = departmentReader.read();
        }

        return new Company(name,  cif, departments);
    }
}
