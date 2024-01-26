package com.crudsprint.sprint1.beer.service.arrayList;

import com.crudsprint.sprint1.beer.model.Beer;

import java.util.ArrayList;

public interface BeerServiceList {
    ArrayList<Beer> getBeersList();
    Beer getBeerById(Long id);
    Beer saveBeer(Beer beer);
    Beer updateBeer(Long id, Beer beer);
    void deleteBeer(Long id);
}
