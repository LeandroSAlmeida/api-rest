package com.springlearning.api.dto;

public class FieldMessage {
    private String fieldName;
    private String messagem;

    public FieldMessage(String fieldName, String messagem) {
        this.fieldName = fieldName;
        this.messagem = messagem;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessagem() {
        return messagem;
    }
}
