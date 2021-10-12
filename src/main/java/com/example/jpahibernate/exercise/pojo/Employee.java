package com.example.jpahibernate.exercise.pojo;

import javax.persistence.*;

@Entity
@Table(name = "employees") //optional, used when table name is different from used in DB
public class Employee {

    @Id
    private int id;
    private String name;
    private int age;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "locationID", referencedColumnName = "id")
    private Location location;

    public Employee(int id, String name, int age, Location location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Location getLocationID() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", location=" + location +
                '}';
    }
}
