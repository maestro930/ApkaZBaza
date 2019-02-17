package com.apka.springowa.entity;


import com.sun.istack.NotNull;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Rental {
    @NotNull
    private Integer rentalId;
    @NotNull
    private LocalDateTime rentalDate;
    @NotNull
    private Short inventoryId;
    @NotNull
    private Short customerId;
    @NotNull
    private LocalDateTime returnDate;
    @NotNull
    private Short staffId;
    @NotNull
    private LocalDateTime lastUptade = LocalDateTime.now();

    public Rental(Integer rentalId, LocalDateTime rentalDate, Short inventoryId, Short customerId, LocalDateTime returnDate, Short staffId, LocalDateTime lastUptade) {
        this.rentalId = rentalId;
        this.rentalDate = rentalDate;
        this.inventoryId = inventoryId;
        this.customerId = customerId;
        this.returnDate = returnDate;
        this.staffId = staffId;
        this.lastUptade = lastUptade;
    }
}
