package de.mydomain.json.ignore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainUserName {
    public static void main(String[] args) throws JsonProcessingException {
        Name name = new Name("Max", "Mustermann");
        UserName user = new UserName(1, name);

        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(user);

        System.out.println(result);
    }
}
