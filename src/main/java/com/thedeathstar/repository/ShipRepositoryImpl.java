package com.thedeathstar.repository;

import com.thedeathstar.model.Ship;

import java.util.ArrayList;
import java.util.List;

public class ShipRepositoryImpl implements ShipRepository {

    public List<Ship> GetShips(){


        List<Ship> shipArray = new ArrayList<Ship>();
        Ship ship = new Ship();

        ship.setId(402);
        ship.setName("TIE Interceptor 402");
        ship.setDescription("TIE fighter, Dagger-shaped wings, four laser cannons");
        ship.setCaptain("Mitch StarScreamer");
        ship.setType("TIE Interceptor");

        shipArray.add(ship);

        return shipArray;

    }
}
