package com.crudsprint.sprint1.beer.repository;

import com.crudsprint.sprint1.beer.model.Beer;
import com.crudsprint.sprint1.beer.repository.ArrayList.BeerRepositoryList;
import com.crudsprint.sprint1.beer.repository.HashMap.BeerRepositoryMap;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
@Repository
public class BeerRepositoryImpl implements BeerRepositoryList, BeerRepositoryMap {

    private final ArrayList<Beer> beerArrayList = new ArrayList<>();
    private final HashMap<Long, Beer> beerMap = new HashMap<>();

    @Override
    public ArrayList<Beer> getBeersList() {
        return new ArrayList<>(beerArrayList);
    }

    @Override
    public HashMap<Long, Beer> getBeersMap() {
        return new HashMap<>(beerMap);
    }
    @Override
    public Beer getBeerById(Long id) {
        // Implementación específica para obtener Beer
        return beerMap.get(id);
    }

    @Override
    public Beer saveBeer(Beer beer) {
        // Implementación específica para guardar Beer
        Long idBeer = beer.getId();
        beerMap.put(idBeer, beer);
        return beer;
    }

    @Override
    public Beer updateBeer(Long id, Beer beer) {
        // Implementación específica para actualizar Beer
        beerMap.put(id, beer);
        return beer;
    }

    @Override
    public void deleteBeer(Long id) {
        // Implementación específica para eliminar Beer
        beerMap.remove(id);
    }
}
