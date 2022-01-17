package de.mydomain.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainJackson {

    public static void main(String[] a) {

        Product product = new Product();

        product.setId(101);
        product.setName("Spark 131");
        product.setPrice(10000);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonStr = objectMapper.writeValueAsString(product);
            System.out.println(jsonStr);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}