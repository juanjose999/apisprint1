package com.crudsprint.sprint1.beer.service;

import com.crudsprint.sprint1.beer.model.Beer;
import com.crudsprint.sprint1.beer.repository.ArrayList.BeerRepositoryList;
import com.crudsprint.sprint1.beer.repository.HashMap.BeerRepositoryMap;
import com.crudsprint.sprint1.beer.service.HashMap.BeerServiceMap;
import com.crudsprint.sprint1.beer.service.arrayList.BeerServiceList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
@Service
public class BeerService implements BeerServiceList, BeerServiceMap {
    private final BeerRepositoryList beerRepositoryList;
    private final BeerRepositoryMap beerRepositoryMap;

    public BeerService(BeerRepositoryList beerRepositoryList, BeerRepositoryMap beerRepositoryMap) {
        this.beerRepositoryList = beerRepositoryList;
        this.beerRepositoryMap = beerRepositoryMap;
    }

    @Override
    public ArrayList<Beer> getBeersList() {
        return beerRepositoryList.getBeersList();
    }

    @Override
    public HashMap<Long, Beer> getBeersMap() {
        return beerRepositoryMap.getBeersMap();
    }

    @Override
    public Beer getBeerById(Long id) {
        return beerRepositoryMap.getBeerById(id);
    }

    @Override
    public Beer saveBeer(Beer beer) {
        return beerRepositoryMap.saveBeer(beer);
    }

    @Override
    public Beer updateBeer(Long id, Beer beer) {
        return beerRepositoryMap.updateBeer(id,beer);
    }

    @Override
    public void deleteBeer(Long id) {
        beerRepositoryMap.deleteBeer(id);
    }
}
