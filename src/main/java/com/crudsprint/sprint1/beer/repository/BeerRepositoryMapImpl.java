package com.crudsprint.sprint1.beer.repository;
import com.crudsprint.sprint1.beer.model.Beer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class BeerRepositoryMapImpl implements BeerRepositoryMap{
    private final HashMap<Long, Beer> beerMap = new HashMap<>();

    @Override
    public HashMap<Long, Beer> getBeers() {
        return beerMap;
    }
    public Beer getBeerById(Long id){
        return beerMap.get(id);
    }

    @Override
    public Beer saveBeer(Beer beer) {
        Long idBeer = beer.getId();
        beerMap.put(idBeer, beer);
        return beer;
    }

    @Override
    public Beer updateBeer(Long id, Beer beer) {
        return beerMap.put(id, beer);
    }

    @Override
    public void deleteBeer(Long id) {
        beerMap.remove(id);
    }
}
