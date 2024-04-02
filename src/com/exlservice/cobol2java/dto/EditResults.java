package com.exlservice.cobol2java.dto;

public class EditResults {

    private String result;
    private boolean successful;
    private String status;
    private String field;
    private String errorMessage;

    public EditResults(String result, boolean successful, String status, String field, String errorMessage) {
        this.result = result;
        this.successful = successful;
        this.status = status;
        this.field = field;
        this.errorMessage = errorMessage;
    }

    public EditResults(boolean successful, String status) {
        this.successful = successful;
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
