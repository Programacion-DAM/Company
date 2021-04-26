package org.iesfm.company;

import org.iesfm.company.exceptions.DepartmentNotFoundException;

/**
 * Interface with all company methods
 */
public interface ICompany {

    /**
     * Returns all employees in a department
     * @param departmentName The deparment name
     * @return
     * @throws DepartmentNotFoundException When department does not exist
     */
    Employee[] findDepartmentEmployees(String departmentName) throws DepartmentNotFoundException;
}
