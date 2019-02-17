package com.apka.springowa.entity;

import com.sun.istack.NotNull;

import java.time.LocalDateTime;

public class Adress {
    @NotNull
private Integer adressId;
    @NotNull
private String address;
    @NotNull
private String district;
    @NotNull
    private int cityId;
    @NotNull
private String postalCode;
    @NotNull
private String phone;
    @NotNull
    private LocalDateTime lastUptade=LocalDateTime.now();

    public Adress(Integer adressId, String address, String district, int cityId, String postalCode, String phone, LocalDateTime lastUptade) {
        this.adressId = adressId;
        this.address = address;
        this.district = district;
        this.cityId = cityId;
        this.postalCode = postalCode;
        this.phone = phone;
        this.lastUptade = lastUptade;
    }
}
