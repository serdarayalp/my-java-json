package de.mydomain.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainCompareJSONs {

    private String json1 = "{ \n" +
            "    \"employee\":\n" +
            "    {\n" +
            "        \"id\": \"1212\",\n" +
            "        \"fullName\":\"John Miles\",\n" +
            "        \"age\": 34,\n" +
            "        \"contact\":\n" +
            "        {\n" +
            "            \"email\": \"john@xyz.com\",\n" +
            "            \"phone\": \"9999999999\"\n" +
            "        }\n" +
            "    }\n" +
            "}";

    private String json2 = "{\n" +
            "    \"employee\":\n" +
            "    {\n" +
            "        \"id\": \"1212\",\n" +
            "        \"age\": 34,\n" +
            "        \"fullName\": \"John Miles\",\n" +
            "        \"contact\":\n" +
            "        {\n" +
            "            \"email\": \"john@xyz.com\",\n" +
            "            \"phone\": \"9999999999\"\n" +
            "        }\n" +
            "    }\n" +
            "}";

    public static void main(String[] args) {
        MainCompareJSONs main = new MainCompareJSONs();
        main.compareJSONs(main.json1, main.json2);
    }

    public void compareJSONs(String json1, String json2) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            if (mapper.readTree(json1).equals(mapper.readTree(json2))) {
                System.out.println("Beide JSON-Objekte sind gleich...");
            } else {
                System.out.println("Beide JSON-Objekte sind NICHT gleich...");
            }
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
    }
}
