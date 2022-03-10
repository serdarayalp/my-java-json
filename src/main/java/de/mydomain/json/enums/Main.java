package de.mydomain.json.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] a) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonStr = objectMapper.writeValueAsString(Distance.KILOMETER);
            System.out.println(jsonStr);
            Distance distance = objectMapper.readValue(jsonStr, Distance.class);
            System.out.println(distance);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}