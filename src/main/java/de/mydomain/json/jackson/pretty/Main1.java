package de.mydomain.json.jackson.pretty;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        User user = new User(1, "Max", "Mustermann", "Max Mustermann");
        String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);

        System.out.println(result);
    }
}
