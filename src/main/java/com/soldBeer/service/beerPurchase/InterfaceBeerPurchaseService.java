package com.soldBeer.service.beerPurchase;

import com.soldBeer.model.SoldBeer;

import java.util.List;
import java.util.UUID;

public interface InterfaceBeerPurchaseService {
    SoldBeer addSale(SoldBeer soldBeer);
    List<SoldBeer> getAll();
    public SoldBeer getById(UUID id);
    public void deleteById(UUID id);
}
