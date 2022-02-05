package com.galinachitakV;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class PersonFactory {

    public static Random RANDOM = new Random();
    public static String[] NAME = {"Sara", "Oleg", "Galina", "Alex", "Viktor", "Max", "Dima"};
    public static String[] SURNAME = {"Chitak", "Chernyak", "Omelchuna", "Lykach", "Collorado",
            "Uvanov", "Chrek"};


    public List<Person> generatePersons(int count) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Person person = calculationPersons();
            personList.add(person);

        }
        return personList;
    }

    public Person calculationPersons() {
        String name = NAME[RANDOM.nextInt(NAME.length)];
        String surname = SURNAME[RANDOM.nextInt(SURNAME.length)];

        int age = RANDOM.nextInt(90 - 18 + 1) + 18;
        int weight = Math.round((RANDOM.nextInt(100 - 65 + 1) + 65));
        int growth = RANDOM.nextInt(200 - 140 + 1) + 140;
        Person person = new Person(name, surname, age, growth, weight);
        person.setAge(age);
        person.setWeight(weight);
        person.setGrowth(growth);
        System.out.println(person);


        return person;
    }
}

