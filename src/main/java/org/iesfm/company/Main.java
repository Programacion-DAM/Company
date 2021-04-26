package org.iesfm.company;

import org.iesfm.company.readers.EmployeeReader;
import org.iesfm.company.readers.Reader;
import org.iesfm.company.readers.XMLCompanyReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("dsf", "23432");

        List<Integer> listInt = Arrays.asList(3, 4, 5, 6, 7, 8, 3, 333);

        ListUtils.print(list);
        ListUtils.print(listInt);

        Reader<Employee> employeeReader = new EmployeeReader();

        Reader<Company> reader = new XMLCompanyReader();

        Company company = reader.read();

        System.out.println(company);
    }
}
