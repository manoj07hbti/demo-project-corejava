package models;

import java.util.Objects;

public class Engineer {

    String name;
    int age;
    int experience;
    String department;

// create param instructor for engineer class

    public Engineer(String name, int age, int experience, String department) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.department = department;
    }

    // create Equals and HashCode for Engineer Class

   @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return age == engineer.age && experience == engineer.experience && Objects.equals(name, engineer.name) && Objects.equals(department, engineer.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, experience, department);
    }

    // create getter and setter methods for engineer class

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
