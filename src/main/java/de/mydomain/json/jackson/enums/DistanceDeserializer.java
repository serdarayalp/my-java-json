package de.mydomain.json.jackson.enums;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class DistanceDeserializer extends StdDeserializer<Distance> {

    protected DistanceDeserializer(StdDeserializer<?> src) {
        super(src);
    }

    @Override
    public Distance deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {

        JsonNode node = jsonParser.getCodec().readTree(jsonParser);

        String unit = node.get("unit").asText();
        double meters = node.get("meters").asDouble();

        for (Distance distance : Distance.values()) {
            if (distance.getUnit().equals(unit) &&
                    Double.compare(distance.getMeters(), meters) == 0) {
                return distance;
            }
        }
        return null;
    }
}