package com.exlservice.cobol2java.enums;

public enum SupplierStatus {
    GOVT_AND_COMMERCIAL ("1"),
    GOVT_ONLY ("2"),
    COMMERCIAL_ONLY ("3");

    private final String id;

    SupplierStatus(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }
}
