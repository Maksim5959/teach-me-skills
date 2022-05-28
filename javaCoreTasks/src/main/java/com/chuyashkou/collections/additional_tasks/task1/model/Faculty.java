package com.chuyashkou.collections.additional_tasks.task1.model;

public enum Faculty {

    EF("ЭФ"),
    GEF("ГЭФ"),
    MTF("МТФ"),
    MSF("МСФ"),
    FAIS("ФАИС");


    Faculty(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
