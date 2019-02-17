package com.apka.springowa.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Language {
    @NotNull
    private Integer languageId;
    @NotNull
    private String name;
    @NotNull
    private LocalDateTime lastUptade = LocalDateTime.now();

    public Language(Integer languageId, String name, LocalDateTime lastUptade) {
        this.languageId = languageId;
        this.name = name;
        this.lastUptade = lastUptade;
    }
}
