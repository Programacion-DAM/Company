package org.iesfm.company;

import java.util.Objects;

public class Employee {
    private String nif;
    private String name;
    private String surnames;
    private String role;
    private int cp;

    public Employee() {

    }

    public Employee(String nif, String name, String surnames, String role, int cp) {
        this.nif = nif;
        this.name = name;
        this.surnames = surnames;
        this.role = role;
        this.cp = cp;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getCp() == employee.getCp() && Objects.equals(getNif(), employee.getNif()) && Objects.equals(getName(), employee.getName()) && Objects.equals(getSurnames(), employee.getSurnames()) && Objects.equals(getRole(), employee.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNif(), getName(), getSurnames(), getRole(), getCp());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("nif='").append(nif).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", surnames='").append(surnames).append('\'');
        sb.append(", role='").append(role).append('\'');
        sb.append(", cp=").append(cp);
        sb.append('}');
        return sb.toString();
    }
}
