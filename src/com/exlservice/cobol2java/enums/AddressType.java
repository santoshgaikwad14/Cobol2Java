package com.exlservice.cobol2java.enums;

public enum AddressType {
    ORDER_ADDRESS ("1"),
    SCHED_ADDRESS ("2"),
    REMIT_ADDRESS ("3");

    private final String id;

    AddressType(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }
}
