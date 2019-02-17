package com.apka.springowa.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Payment {
    @NotNull
    private Integer paymentId;
    @NotNull
    private Short customerId;
    @NotNull
    private Short staffId;
    @NotNull
    private Integer rentalId;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private LocalDateTime paymentDate;

    public Payment(Integer paymentId, Short customerId, Short staffId, Integer rentalId, BigDecimal amount, LocalDateTime paymentDate) {
        this.paymentId = paymentId;
        this.customerId = customerId;
        this.staffId = staffId;
        this.rentalId = rentalId;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }
}
