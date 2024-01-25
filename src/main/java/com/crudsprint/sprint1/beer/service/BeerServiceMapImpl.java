package com.crudsprint.sprint1.beer.service;

import com.crudsprint.sprint1.beer.model.Beer;
import com.crudsprint.sprint1.beer.repository.BeerRepositoryMap;
import com.crudsprint.sprint1.beer.repository.BeerRepositoryMapImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BeerServiceMapImpl implements BeerServiceMap {
    private final BeerRepositoryMap beerRepository;
    @Autowired
    public BeerServiceMapImpl(BeerRepositoryMap beerRepository) {
        this.beerRepository = beerRepository;
    }

    public HashMap<Long, Beer> getBeers() {
        return beerRepository.getBeers();
    }

    @Override
    public Beer getBeerById(Long id) {
        return beerRepository.getBeerById(id);
    }
    @Override
    public Beer saveBeer(Beer beer) {
        return beerRepository.saveBeer(beer);
    }

    @Override
    public Beer updateBeer(Long id, Beer beer) {
        return beerRepository.updateBeer(id, beer);
    }

    @Override
    public void deleteBeer(Long id) {
        beerRepository.deleteBeer(id);
    }
}
