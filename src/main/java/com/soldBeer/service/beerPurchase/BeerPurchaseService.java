package com.soldBeer.service.beerPurchase;

import com.soldBeer.model.SoldBeer;
import com.soldBeer.repository.SoldBeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BeerPurchaseService implements InterfaceBeerPurchaseService {
    @Autowired
    private SoldBeerRepository soldBeerRepository;

    public SoldBeer addSale(SoldBeer soldBeer) {
        
        SoldBeer soldBeerSaved = soldBeerRepository.save(soldBeer);
        return soldBeerSaved;
    }

    public List<SoldBeer> getAll() {
        return soldBeerRepository.findAll();
    }

    public SoldBeer getById(UUID id) {
        return soldBeerRepository.getOne(id);
    }

    public void deleteById(UUID id) {
        soldBeerRepository.deleteById(id);
    }
}
