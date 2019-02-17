package com.apka.springowa.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Category {
    @NotNull
    private Integer  categoryId;

    @NotNull
    private String name;

    @NotNull
    private LocalDateTime lastUptade = LocalDateTime.now();

    public Category(Integer categoryId, String name, LocalDateTime lastUptade) {
        this.categoryId = categoryId;
        this.name = name;
        this.lastUptade = lastUptade;
    }
}