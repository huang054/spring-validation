package com.validation.springvalidation.domain;

import com.validation.springvalidation.validation.constraints.MyCardsValidation;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class User {

    @Max(1000)
    private long id;

    @NotNull
    private String name;

    @MyCardsValidation
    private String carsNo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarsNo() {
        return carsNo;
    }

    public void setCarsNo(String carsNo) {
        this.carsNo = carsNo;
    }
}
