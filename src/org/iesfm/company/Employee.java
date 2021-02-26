package org.iesfm.company;

public class Employee {
    private String nif;
    private String name;
    private String surnames;
    private String role;
    private int cp;

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
}
