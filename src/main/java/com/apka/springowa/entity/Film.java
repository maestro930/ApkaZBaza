package com.apka.springowa.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @NotNull
    private Integer filmId;
    @NotNull
    private String title;
    @NotNull
    private String destricption;
    @NotNull
    private Short languageId;
    @NotNull
    private Short originalId;
    @NotNull
    private Short rentalDuration=3;
    @NotNull
    private BigDecimal rentalRate = new BigDecimal(4.99);
    @NotNull
    private Short lenght;
    @NotNull
    private BigDecimal replacementCost;
    @NotNull
    private LocalDateTime lastUptade = LocalDateTime.now();
    @NotNull
    private String specialFeatures;
    @NotNull
    private String fullText;

    public Film(Integer filmId, String title, String destricption, Short languageId, Short originalId, Short rentalDuration, BigDecimal rentalRate, Short lenght, BigDecimal replacementCost, LocalDateTime lastUptade, String specialFeatures, String fullText) {
        this.filmId = filmId;
        this.title = title;
        this.destricption = destricption;
        this.languageId = languageId;
        this.originalId = originalId;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.lenght = lenght;
        this.replacementCost = new BigDecimal(19.99);
        this.lastUptade = lastUptade;
        this.specialFeatures = specialFeatures;
        this.fullText = fullText;
    }
}
