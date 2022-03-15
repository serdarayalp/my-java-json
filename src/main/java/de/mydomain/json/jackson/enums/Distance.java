package de.mydomain.json.jackson.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

/*@JsonSerialize(using = DistanceSerializer.class)*/
/*@JsonDeserialize(using = DistanceDeserializer.class)*/
/*@JsonFormat(shape = JsonFormat.Shape.OBJECT)*/
public enum Distance {

    @JsonProperty("distance-in-km") KILOMETER("km", 1000),
    @JsonProperty("distance-in-mile") MILE("miles", 1609.34),
    @JsonProperty("distance-in-meter") METER("meters", 1),
    @JsonProperty("distance-in-inch") INCH("inches", 0.0254),
    @JsonProperty("distance-in-cm") CENTIMETER("cm", 0.01),
    @JsonProperty("distance-in-mm") MILLIMETER("mm", 0.001);

    private String unit;
    private final double meters;

    Distance(String unit, double meters) {
        this.unit = unit;
        this.meters = meters;
    }

    public String getUnit() {
        return unit;
    }

    /*@JsonValue*/
    public double getMeters() {
        return meters;
    }

    /*
    @JsonCreator
    public static Distance forValues(@JsonProperty("unit") String unit,
                                     @JsonProperty("meters") double meters) {
        for (Distance distance : Distance.values()) {
            if (distance.unit.equals(unit) && Double.compare(distance.meters, meters) == 0) {
                return distance;
            }
        }
        return null;
    }
    */
}