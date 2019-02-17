package com.apka.springowa.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Store {
    @NotNull
    private Integer storeId;
    @NotNull
    private Short managerStaff;
    @NotNull
    private Short addressId;
    @NotNull
    private LocalDateTime lastUptade=LocalDateTime.now();

    public Store(Integer storeId, Short managerStaff, Short addressId, LocalDateTime lastUptade) {
        this.storeId = storeId;
        this.managerStaff = managerStaff;
        this.addressId = addressId;
        this.lastUptade = lastUptade;
    }
}
