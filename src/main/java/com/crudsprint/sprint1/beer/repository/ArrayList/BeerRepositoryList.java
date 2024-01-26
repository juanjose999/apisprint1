package com.crudsprint.sprint1.beer.repository.ArrayList;

import com.crudsprint.sprint1.beer.model.Beer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public interface BeerRepositoryList{
    ArrayList<Beer> getBeersList();

    Beer getBeerById(Long id);
    Beer saveBeer(Beer beer);
    Beer updateBeer(Long id, Beer beer);
    void deleteBeer(Long id);
}
