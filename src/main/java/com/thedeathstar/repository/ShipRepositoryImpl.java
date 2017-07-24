package com.thedeathstar.repository;

import com.thedeathstar.model.Ship;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeremy on 7/23/17.
 */
public class ShipRepositoryImpl implements ShipRepository {

    public List<Ship> GetShips(){


        List<Ship> shipArray = new ArrayList<Ship>();

        shipArray.add(GetShip(402));
        shipArray.add(GetShip(107));

        return shipArray;

    }

    public Ship GetShip(int id){

        Ship ship = new Ship();

        switch(id){
            case 402 :

                ship.setId(402);
                ship.setName("TIE Interceptor 402");
                ship.setDescription("TIE fighter, Dagger-shaped wings, four laser cannons");
                break;

            case 107 :

                ship.setId(107);
                ship.setName("TIE fighter 107");
                ship.setDescription("Twin ion engine (TIE), Fighter");
                break;

            default:

                ship = null;
                break;
        }

        return ship;
    }
}
