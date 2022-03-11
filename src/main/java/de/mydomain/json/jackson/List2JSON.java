package de.mydomain.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List2JSON {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        List<String> progLangs = new ArrayList<>();

        progLangs.add("C");
        progLangs.add("C++");
        progLangs.add("Java");
        progLangs.add("Java EE");
        progLangs.add("Python");
        progLangs.add("Scala");
        progLangs.add("JavaScript");

        String json = mapper.writeValueAsString(progLangs);

        System.out.println(json);

        progLangs = mapper.readValue(json, List.class);

        for (Iterator<String> iterator = progLangs.iterator(); iterator.hasNext(); ) {
            String progLang = (String) iterator.next();
            System.out.println(progLang);
        }
    }
}
