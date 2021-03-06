package de.mydomain.json.jackson.annotation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        User user = new User(1, "Max", "Mustermann", "Max Mustermann");
        String result = mapper.writeValueAsString(user);

        System.out.println(result);
    }
}
