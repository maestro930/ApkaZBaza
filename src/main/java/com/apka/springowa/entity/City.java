package com.apka.springowa.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class City {
    @NotNull
    @Id
    private Short cityId;

    @NotNull
    private String cityText;

    @NotNull
    private Integer countryId;

    @NotNull
    private LocalDateTime lastUptade = LocalDateTime.now();

    public City(Short cityId, String cityText, Integer countryId, LocalDateTime lastUptade) {
        this.cityId = cityId;
        this.cityText = cityText;
        this.countryId = countryId;
        this.lastUptade = lastUptade;
    }
}
