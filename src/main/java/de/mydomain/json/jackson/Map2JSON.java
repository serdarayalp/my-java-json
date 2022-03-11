package de.mydomain.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Map2JSON {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Map<String, Integer> days = new HashMap<>();
        days.put("MON", Calendar.MONDAY);
        days.put("TUE", Calendar.TUESDAY);
        days.put("WED", Calendar.WEDNESDAY);
        days.put("THU", Calendar.THURSDAY);
        days.put("FRI", Calendar.FRIDAY);
        days.put("SAT", Calendar.SATURDAY);
        days.put("SUN", Calendar.SUNDAY);

        String json = mapper.writeValueAsString(days);

        System.out.println(json);

        days = mapper.readValue(json, Map.class);

        for (Map.Entry<String, Integer> day : days.entrySet()) {
            System.out.println(day.getKey() + " = " + day.getValue());
        }
    }
}
