package model;

import javax.persistence.*;

@Entity(name = "Teacher")
public class Teacher {


    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "AGE")
    private int age;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Id
    public String getId() {
        return id;
    }
}
