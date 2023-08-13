package com.workintech.main;

import com.workintech.model.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Dogancan", "Kınık"));
        employees.add(new Employee(1, "Dogancan", "Kınık"));
        employees.add(new Employee(2, "Derya", "Balın"));
        employees.add(new Employee(2, "Derya", "Balın"));
        employees.add(new Employee(3, "Ilgın", "Oktem"));
        employees.add(new Employee(3, "Ilgın", "Oktem"));

        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();

        Iterator iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            if (employeeMap.containsKey(employee.getId())) {
                removedEmployees.add(employee);
                iterator.remove();
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }

        System.out.println(employees);
        System.out.println(employeeMap);
    }
}