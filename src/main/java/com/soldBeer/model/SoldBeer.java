package com.soldBeer.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.util.UUID;

@EnableAutoConfiguration
@Entity
@Data
@AllArgsConstructor
public final class SoldBeer {
    @Id
    private UUID soldBeerId;

    @Column
    private int moneyGain;
    private String beerType;
    private UUID visitorsId;

    public SoldBeer() {
        soldBeerId = UUID.randomUUID();
    }

    public SoldBeer(int moneyGain, String beerType) {
        soldBeerId = UUID.randomUUID();
        this.moneyGain = moneyGain;
        this.beerType = beerType;
    }
}
