package com.exlservice.cobol2java.enums;

public enum VehicleType {
    CHR ("CHR"),
    FOR ("FOR"),
    GM ("GM "),
    VW ("VW "),
    TOY ("TOY"),
    JAG ("JAG"),
    PEU ("PEU"),
    BMW ("BMW");

    private final String id;

    VehicleType(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }
}
