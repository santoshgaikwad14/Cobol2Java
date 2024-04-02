package com.exlservice.cobol2java.enums;

public enum SupplierType {
    SUBCONTRACTOR ("S"),
    DISTRIBUTOR ("D"),
    MANUFACTURER ("M"),
    IMPORTER ("I");

    private final String id;

    SupplierType(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }
}
