package com.apka.springowa.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Inventory {
    @NotNull
    private Integer inventoryId;
    @NotNull
    private  Short filmId;
    @NotNull
    private Short storeId;
    @NotNull
    private LocalDateTime lastUptade = LocalDateTime.now();

    public Inventory(Integer inventoryId, Short filmId, Short storeId, LocalDateTime lastUptade) {
        this.inventoryId = inventoryId;
        this.filmId = filmId;
        this.storeId = storeId;
        this.lastUptade = lastUptade;
    }
}
