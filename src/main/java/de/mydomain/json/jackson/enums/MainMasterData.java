package de.mydomain.json.jackson.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainMasterData {

    public static void main(String[] a) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonStr = objectMapper.writeValueAsString(MasterData.CONTRACT_PARTNER);
            System.out.println(jsonStr);
            MasterData masterData = objectMapper.readValue(jsonStr, MasterData.class);
            System.out.println(masterData);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}