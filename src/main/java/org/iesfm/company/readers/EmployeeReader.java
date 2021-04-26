package org.iesfm.company.readers;

import org.iesfm.company.Employee;

import java.util.Scanner;

public class EmployeeReader implements Reader<Employee> {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public Employee read() {
        System.out.println("Introduce el NIF: ");
        String nif = scanner.nextLine();
        System.out.println("Introduce el nombre: ");
        String name = scanner.nextLine();
        System.out.println("Introduce los apellidos: ");
        String surnames = scanner.nextLine();
        System.out.println("Introduce el cargo: ");
        String role = scanner.nextLine();
        System.out.println("Introduce el código postal: ");
        int cp = scanner.nextInt();
        scanner.nextLine();
        return new Employee(nif, name, surnames, role, cp);
    }
}
