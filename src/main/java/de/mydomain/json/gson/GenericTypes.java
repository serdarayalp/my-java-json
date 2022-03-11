package de.mydomain.json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class GenericTypes {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        List<String> list = Arrays.asList("INDIA",
                "AUSTRALIA",
                "ENGLAND",
                "SOUTH AFRICA");

        String jsonStr = gson.toJson(list);
        System.out.println(jsonStr);

        Type listType = new TypeToken<List<String>>() {
        }.getType();

        list = gson.fromJson(jsonStr, listType);
        System.out.println(list);
    }
}
