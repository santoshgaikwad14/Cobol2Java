package com.exlservice.cobol2java.enums;

public enum SupplierRating {
    HIGH ("3"),
    AVERAGE ("2"),
    LOW ("1");

    private final String id;

    SupplierRating(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }
}
