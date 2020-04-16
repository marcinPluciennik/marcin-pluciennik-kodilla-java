package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public final class World {
    private final List<Continent> world = new ArrayList<>();

    public void addContinent(Continent continent){
        world.add(continent);
    }

    public List<Continent> getWorld() {
        return world;
    }

    public BigDecimal getPeopleQuantity(){
        return world.stream()
                .flatMap(partOfWorld -> partOfWorld.getContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
