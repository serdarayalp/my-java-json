package de.mydomain.json.jackson;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

import java.io.File;
import java.io.IOException;

public class MyJsonGenerator {
    public static void main(String[] args) throws IOException {

        JsonFactory factory = new JsonFactory();

        JsonGenerator generator = factory.createGenerator(new File("post.json"), JsonEncoding.UTF8);

        generator.writeStartObject(); // Start with left brace i.e. {

        generator.writeNumberField("id", 100);
        generator.writeStringField("title", "Jackson JSON API Guide");
        generator.writeStringField("description", "Post about Jackson JSON API");
        generator.writeStringField("content", "HTML content here");

        generator.writeFieldName("tags");

        generator.writeStartArray(); // Start with left bracket i.e. [

        generator.writeStartObject(); // Start with left brace i.e. {
        generator.writeNumberField("id", 1);
        generator.writeStringField("name", "JSON");
        generator.writeEndObject(); // End with right brace i.e }

        generator.writeStartObject(); // Start with left brace i.e. {
        generator.writeNumberField("id", 2);
        generator.writeStringField("name", "Java");
        generator.writeEndObject(); // End with right brace i.e }

        generator.writeStartObject(); // Start with left brace i.e. {
        generator.writeNumberField("id", 3);
        generator.writeStringField("name", "Jackson");
        generator.writeEndObject(); // End with right brace i.e }

        generator.writeEndArray(); // End with right bracket i.e. ]

        generator.writeEndObject(); // End with right brace i.e }

        // Close JSON generator
        generator.close();

    }
}
