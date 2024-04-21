package com.gyanaranjan.NWPro01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main01 {
    /**
     *  ---> Filter using some
     *
     */
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("lipa",32,3000.00));
        employees.add(new Employee("rabi",25,40000.75));
        employees.add(new Employee("hari",30,50000.89));
        employees.add(new Employee("gyana",35,70000.00));
        employees.add(new Employee("rahul",28,7000));


        // filter the element based on age --> below 30<
       employees.stream().filter(employee -> employee.getAge()<30).forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++");
//        employees.stream().map(Employee::getAge).forEach(System.out::println);
//        employees.stream().map(Employee::getSalary).filter(e->e<5000).forEach(System.out::println);
        Double v = employees.stream().map(Employee::getSalary).max(Comparator.naturalOrder()).get();
        System.out.println(v);
    }
}
