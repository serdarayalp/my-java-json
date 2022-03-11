package de.mydomain.json.jackson.ignore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        User user = new User(1, "Tony", "Stark");

        String result = mapper.writeValueAsString(user);

        System.out.println(result);
    }
}
