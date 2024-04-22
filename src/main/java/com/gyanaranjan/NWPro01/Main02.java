package com.gyanaranjan.NWPro01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main02 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("lipa",32,3000.00));
        employees.add(new Employee("rabi",25,40000.75));
        employees.add(new Employee("hari",30,50000.89));
        employees.add(new Employee("gyana",35,70000.00));
        employees.add(new Employee("rahul",28,7000));

        // reduction sum of total  salary :-->
        employees.stream().map(Employee::getName).map(String::toUpperCase).forEach(System.out::println);
        String reduce =employees.stream().map(Employee::getName).map(String::toUpperCase).reduce( String::concat).get();
        System.out.println(reduce);
        // Partitioning employee based on age :-->
        System.out.println("++++++++++++++++++++++++++++++");
        Map<Boolean, List<Employee>> collect = employees.stream().collect(Collectors.partitioningBy((e -> e.getAge() >= 30)));
        collect.forEach((k,v)-> {
            if(k){
                System.out.println("Age Above 30 Are ");
            }else{
                System.out.println("Age below 30 Are ");
            }
            v.forEach(System.out::println);});
        System.out.println("+++++++++++++++++++++++++++++++++++");


    }
}
