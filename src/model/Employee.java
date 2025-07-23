package model;

public class Employee {
    String name;
    int idCode;
    String team;

    public Employee(String name, int idCode, String team) {
        this.name = name;
        this.idCode = idCode;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
