package com.galinachitakV;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int weight;
    private int growth;

    public Person(String name, String surname, int age, int weight, int growth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.growth = growth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getGrowth() {
        return growth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", growth=" + growth +
                '}';
    }
}