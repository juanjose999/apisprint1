package com.crudsprint.sprint1.beer.controller;


import com.crudsprint.sprint1.beer.model.Beer;
import com.crudsprint.sprint1.beer.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/beers")
public class BeerController {
    @Autowired
    private BeerService beerService;

    @GetMapping("/list")
    public ArrayList<Beer> getBeersList(){
        return beerService.getBeersList();
    }
    @GetMapping("/map")
    public HashMap<Long, Beer> getBeersMap(){
        return beerService.getBeersMap();
    }
    @GetMapping("/{id}")
    public Beer getBeerById(@PathVariable("id") Long id){
        return beerService.getBeerById(id);
    }
    @PostMapping
    public Beer saveBeer(@RequestBody Beer beer){
        return beerService.saveBeer(beer);
    }
    @PutMapping("/{id}")
    public <List>Beer updateBeer(@PathVariable Long id,@RequestBody Beer beer){
        return beerService.updateBeer(id,beer);
    }

    @DeleteMapping("/{id}")
    public void deleteBeer(@PathVariable Long id){
        beerService.deleteBeer(id);
    }

}
