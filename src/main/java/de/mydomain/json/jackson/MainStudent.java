package de.mydomain.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MainStudent {
    public static void main(String[] args) throws Exception {
        Student std = new Student();

        std.setId(1);
        std.setName("Krishna");
        std.setAge(30);
        std.setPhone(9848022338L);

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(std);

        System.out.println(jsonString);
    }
}
