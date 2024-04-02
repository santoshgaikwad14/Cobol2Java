package com.exlservice.cobol2java.dto;

public class Suppliers {
    private String code;
    private String type ;
    private String name;
    private String perf;
    private String rating;
    private String status;
    private String actDate;

    public Suppliers(String dataLine) {
        this.code = dataLine.substring(92,102);
        this.type = dataLine.substring(102,103);
        this.name = dataLine.substring(103,118);
        this.perf = dataLine.substring(118,121);
        this.rating = dataLine.substring(121,122);
        this.status = dataLine.substring(122,123);
        this.actDate = dataLine.substring(123,131);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerf() {
        return perf;
    }

    public void setPerf(String perf) {
        this.perf = perf;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActDate() {
        return actDate;
    }

    public void setActDate(String actDate) {
        this.actDate = actDate;
    }
}

