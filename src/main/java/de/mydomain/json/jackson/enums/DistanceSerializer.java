package de.mydomain.json.jackson.enums;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class DistanceSerializer extends StdSerializer {

    public DistanceSerializer() {
        super(Distance.class);
    }

    public DistanceSerializer(Class t) {
        super(t);
    }

    @Override
    public void serialize(Object o, JsonGenerator generator, SerializerProvider provider) throws IOException, JsonProcessingException {

        Distance distance = (Distance) o;

        generator.writeStartObject();

        /*generator.writeFieldName("class");
        generator.writeString(Distance.class.getName());*/

        generator.writeFieldName("name");
        generator.writeString(distance.name());

        generator.writeFieldName("unit");
        generator.writeString(distance.getUnit());

        generator.writeFieldName("meters");
        generator.writeNumber(distance.getMeters());

        generator.writeEndObject();
    }
}