package com.crudsprint.sprint1.beer.controller;


import com.crudsprint.sprint1.beer.model.Beer;
import com.crudsprint.sprint1.beer.service.BeerServiceMapImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/beers")
public class BeerController {
    private BeerServiceMapImpl beerServiceMap;
    @Autowired
    public BeerController(BeerServiceMapImpl beerServiceMap){
        this.beerServiceMap=beerServiceMap;
    }

    @GetMapping
    public HashMap<Long, Beer> getAllBeers(){
        return beerServiceMap.getBeers();
    }
    @GetMapping("/{id}")
    public Beer getBeerById(@PathVariable("id") Long id){
        return beerServiceMap.getBeerById(id);
    }
    @PostMapping
    public Beer saveBeer(@RequestBody Beer beer){
        return beerServiceMap.saveBeer(beer);
    }
    @PutMapping("/{id}")
    public <List>Beer updateBeer(@PathVariable Long id,@RequestBody Beer beer){
        return beerServiceMap.updateBeer(id,beer);
    }

    @DeleteMapping("/{id}")
    public void deleteBeer(@PathVariable Long id){
        beerServiceMap.deleteBeer(id);
    }

}
