package com.apka.springowa.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class FilmActor {
    @NotNull
    private Short actorId;
    @NotNull
    private Short filmId;
    @NotNull
    private LocalDateTime lastUptade = LocalDateTime.now();

    public FilmActor(Short actorId, Short filmId, LocalDateTime lastUptade) {
        this.actorId = actorId;
        this.filmId = filmId;
        this.lastUptade = lastUptade;
    }
}
