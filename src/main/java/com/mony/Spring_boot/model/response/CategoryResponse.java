package com.mony.Spring_boot.model.response;

public class CategoryResponse {

    private Long id;
    private String name;
    private String gender;

    public CategoryResponse(Long id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
