package com.apka.springowa.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class FilmCategory {
    @NotNull
    private Short filmId;
    @NotNull
    private Short categoryId;
    @NotNull
    private LocalDateTime lastUptade = LocalDateTime.now();

    public FilmCategory(Short filmId, Short categoryId, LocalDateTime lastUptade) {
        this.filmId = filmId;
        this.categoryId = categoryId;
        this.lastUptade = lastUptade;
    }
}
