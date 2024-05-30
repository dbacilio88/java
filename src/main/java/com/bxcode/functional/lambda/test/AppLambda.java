package com.bxcode.functional.lambda.test;

import com.bxcode.functional.dto.Employee;
import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * AppLambda
 * <p>
 * AppLambda class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BXCODE APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author Bxcode
 * @author dbacilio88@outlook.es
 * @since 27/05/2024
 */

@Log4j2
public class AppLambda {


    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(3, 4, 1, 7, 2, 5, 8, 1);
        number.sort((a, b) -> a - b);
        number.sort(Comparator.comparingInt(a -> a));
        log.info("number {}", number);

        List<String> names = Arrays.asList("David", "Juan", "Roberto");
        names.sort(String::compareTo);
        names.sort(Comparator.reverseOrder());
        log.info("names {}", names);

        Employee employee1 = Employee.builder()
                .id(1L)
                .name("Miguel")
                .age(26)
                .description("employee1")
                .build();
        Employee employee2 = Employee.builder()
                .id(2L)
                .name("Antonio")
                .age(25)
                .description("employee2")
                .build();
        Employee employee3 = Employee.builder()
                .id(3L)
                .age(22)
                .name("Sarita")
                .description("employee3")
                .build();

        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);
        employees.sort((a, b) -> a.getName().compareTo(b.getName()));
        employees.sort(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getName));
        log.info("employees {}", employees);
    }
}