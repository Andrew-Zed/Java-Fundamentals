package com.andrew.javaStreams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Imperative Approach
        /*
        *
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if(person.getGender().equals(Gender.FEMALE)){
                females.add(person);
            }
        }

        females.forEach(System.out::println);

         */

        // Declarative Approach

        // Filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

//        females.forEach(System.out::println);

        // Sort
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());

//        sorted.forEach(System.out::println);

        // All match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 24 );

//        System.out.println(allMatch);

        // Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 50);

//        System.out.println(anyMatch);

        // None match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Anthony"));

//        System.out.println(noneMatch);

        // Max
        Optional<Person> max1 = people.stream()
                .max(Comparator.comparing(Person::getAge));

        people.stream()
                .max(Comparator.comparing(Person::getAge));
//                .ifPresent(System.out::println);

//        System.out.println(max1);

        // Min
        Optional<Person> min = people.stream()
                .min(Comparator.comparing(Person::getAge));

        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

//        System.out.println(min);

        // Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        });

        // Oldest Female
        Optional<String> oldestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestFemaleAge.ifPresent(System.out::println);

    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("James Bond", 30, Gender.MALE),
                new Person("Angelina Jolie", 33, Gender.FEMALE),
                new Person("Helen Troy", 45, Gender.FEMALE),
                new Person("Jack Bauer", 45, Gender.MALE),
                new Person("Gerald Cook", 23, Gender.MALE),
                new Person("Zelda Brown", 40, Gender.FEMALE),
                new Person("Alicia Keys", 20, Gender.FEMALE),
                new Person("Brad Pitt", 39, Gender.MALE),
                new Person("Anthony", 19, Gender.MALE)
        );
    }
}
