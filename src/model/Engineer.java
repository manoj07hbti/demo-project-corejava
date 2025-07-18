package model;

import java.util.Objects;

public class Engineer
{
    String name;
    int salary;
    String specialization;

    public Engineer(String name, int salary, String specialization)
    {
        this.name = name;
        this.salary = salary;
        this.specialization = specialization;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return salary == engineer.salary && Objects.equals(name, engineer.name) && Objects.equals(specialization, engineer.specialization);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, salary, specialization);
    }
}
