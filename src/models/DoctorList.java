package models;

import java.util.Objects;

public class DoctorList {


    String name;
    String specialty;
    int experience;
    int fees;

// create param instructor

    public DoctorList(String name, String specialty, int experience, int fees) {
        this.name = name;
        this.specialty = specialty;
        this.experience = experience;
        this.fees = fees;
    }

    // create Equals and HashCode for Doctor Class

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DoctorList that = (DoctorList) o;
        return experience == that.experience && fees == that.fees && Objects.equals(name, that.name) && Objects.equals(specialty, that.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, specialty, experience, fees);
    }


    // create getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}
