package de.mydomain.json.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainCity {

    public static void main(String[] a) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            City berlin = new City();
            berlin.setDistance(Distance.KILOMETER);

            String serializedBerlin = objectMapper.writeValueAsString(berlin);
            System.out.println(serializedBerlin);

            City deserializedBerlin = objectMapper.readValue(serializedBerlin, City.class);
            if(Distance.KILOMETER == deserializedBerlin.getDistance()) {
                System.out.println("Beide sind gleich...");
            }

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
