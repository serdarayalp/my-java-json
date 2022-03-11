package de.mydomain.json.jackson.annotation.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum EmployeeType {

    FullTime("Full Time"),
    PartTime("Part Time");

    private String displayName;

    EmployeeType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}