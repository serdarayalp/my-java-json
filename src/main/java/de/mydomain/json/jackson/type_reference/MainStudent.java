package de.mydomain.json.jackson.type_reference;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainStudent {
    public static void main(String args[]) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            Map<String, UserData> userDataMap = new HashMap<>();

            UserData userData = new UserData();

            int[] marks = {1, 2, 3};

            Student student = new Student();
            student.setAge(10);
            student.setName("Max");

            userData.setStudent(student);
            userData.setName("Max Mustermann");
            userData.setVerified(Boolean.FALSE);
            userData.setMarks(marks);

            TypeReference typeReference = new TypeReference<Map<String, UserData>>() {
            };

            userDataMap.put("userData", userData);

            String json = mapper.writeValueAsString(userDataMap);

            userDataMap = (Map<String, UserData>) mapper.readValue(json, Object.class);

            System.out.println(userDataMap.get("userData").getStudent());
            System.out.println(userDataMap.get("userData").getName());
            System.out.println(userDataMap.get("userData").getVerified());
            System.out.println(Arrays.toString(userDataMap.get("userData").getMarks()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
