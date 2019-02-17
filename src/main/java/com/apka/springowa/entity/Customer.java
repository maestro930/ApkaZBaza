package com.apka.springowa.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Customer {
    @NotNull
    private Integer customerId;
    @NotNull
    private Short storeId;
    @NotNull
    private Short addresId;
    @NotNull
    private Boolean activeBool;
    @NotNull
    private LocalDate createDate = LocalDate.now();
    @NotNull
    private LocalDateTime lastUptade = LocalDateTime.now();
    @NotNull
    private Integer active;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;

    public Customer(Integer customerId, Short storeId, Short addresId, Boolean activeBool, LocalDate createDate, LocalDateTime lastUptade, Integer active, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.storeId = storeId;
        this.addresId = addresId;
        this.activeBool = activeBool;
        this.createDate = createDate;
        this.lastUptade = lastUptade;
        this.active = active;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
