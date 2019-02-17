package com.apka.springowa.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Staff {
    @NotNull
    private Integer staffId;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private Short addressId;
    @NotNull
    private String  email;
    @NotNull
    private Short storeId;
    @NotNull
    private Boolean active=true;
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private LocalDateTime lastUptade=LocalDateTime.now();
    @NotNull
    private Byte picture;

    public Staff(Integer staffId, String firstName, String lastName, Short addressId, String email, Short storeId, Boolean active, String username, String password, LocalDateTime lastUptade, Byte picture) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressId = addressId;
        this.email = email;
        this.storeId = storeId;
        this.active = active;
        this.username = username;
        this.password = password;
        this.lastUptade = lastUptade;
        this.picture = picture;
    }
}
