package com.crudsprint.sprint1.beer.service;

import com.crudsprint.sprint1.beer.model.Beer;

import java.util.HashMap;

public interface BeerServiceMap {
    HashMap<Long, Beer>getBeers();
    Beer getBeerById(Long id);
    Beer saveBeer(Beer beer);
    Beer updateBeer(Long id, Beer beer);
    void deleteBeer(Long id);
}