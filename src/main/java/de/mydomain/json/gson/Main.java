package de.mydomain.json.gson;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone();

        mobilePhone.setBrand("Samsung");
        mobilePhone.setName("J2 Core");
        mobilePhone.setRam(2);
        mobilePhone.setRom(4);

        System.out.println("JSON representation: ");

        Gson gson = new Gson();
        System.out.println(gson.toJson(mobilePhone));
    }
}