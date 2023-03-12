package com.springapi.dto;

public class UserDTO {
    private int Id;
    private String Name;
    private int Age;
    private String MotherTongue;

    public UserDTO() {
    }

    public UserDTO(int id, String name, int age, String motherTongue) {
        Id = id;
        Name = name;
        Age = age;
        MotherTongue = motherTongue;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getMotherTongue() {
        return MotherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        MotherTongue = motherTongue;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", MotherTongue='" + MotherTongue + '\'' +
                '}';
    }
}