package model;

public class Doctor
{
    String name;
    int age;
    String specialization;

    public Doctor(String name, int age, String specialization)
    {
        this.name = name;
        this.age = age;
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

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }
}
