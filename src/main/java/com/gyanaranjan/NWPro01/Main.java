package com.gyanaranjan.NWPro01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    /**
     * Comparator in java 8 :--->
     */
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("lipa",30,3000.00));
        employees.add(new Employee("rabi",25,40000.75));
        employees.add(new Employee("hari",20,50000.89));
        employees.add(new Employee("gyana",25,70000.00));
        employees.add(new Employee("rahul",28,7000));

        // sorting Employee by name using comparator :-

        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        System.out.println("1+++++++++++++++++++++++++++++++++++++");
        // sorting Employee by age using comparator :-
        employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
        System.out.println("2++++++++++++++++++++++++++++++++++++++++");
        // sorting Employee by salary low to Max using comparator :-
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
        System.out.println("3++++++++++++++++++++++++++++++++++++++");
        // sorting Employee by salary Max to Low using comparator :-
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
        System.out.println("4++++++++++++++++++++++++++++++++++++++++++++");
        // sorting Employee by age then sort by salary using comparator :-
        employees.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary).reversed()).forEach(System.out::println);



    }
}
