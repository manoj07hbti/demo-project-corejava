package model;

public class Student {
    String name;
    int age;
    String subject;
    int aClass;

    public Student(String name, int age, String subject, int aClass) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.aClass = aClass;
    }

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getaClass() {
        return aClass;
    }

    public void setClass(int aClass) {
        aClass = aClass;
    }
}
