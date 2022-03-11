package de.mydomain.json.jackson.annotation.enums;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class MainEmployee {
    public static void main(String[] args) throws IOException {

        Employee employee = new Employee();

        employee.setName("Amy");
        employee.setEmployeeType(EmployeeType.PartTime);

        System.out.println("-- before serialization --");
        System.out.println(employee);

        System.out.println("-- after serialization --");

        ObjectMapper objectMapper = new ObjectMapper();

        String jsonString = objectMapper.writeValueAsString(employee);
        System.out.println(jsonString);
    }
}
