package org.iesfm.company;

import java.util.Arrays;
import java.util.Objects;

// POJO
public class Company {

    private String name;
    private String cif;
    private Department[] departments;

    public Company() {

    }

    public Company(String name, String cif, Department[] departments) {
        this.name = name;
        this.cif = cif;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(getName(), company.getName()) && Objects.equals(getCif(), company.getCif()) && Arrays.equals(getDepartments(), company.getDepartments());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getCif());
        result = 31 * result + Arrays.hashCode(getDepartments());
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Company{");
        sb.append("name='").append(name).append('\'');
        sb.append(", cif='").append(cif).append('\'');
        sb.append(", departments=").append(Arrays.toString(departments));
        sb.append('}');
        return sb.toString();
    }
}
