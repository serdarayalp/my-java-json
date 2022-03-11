package de.mydomain.json.ignore_null_empty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        // Employee employee = new Employee(1, null, "");
        Employee employee = new Employee(1, null, "Mustermann");
        String result = mapper.writeValueAsString(employee);

        System.out.println(result);

    }
}