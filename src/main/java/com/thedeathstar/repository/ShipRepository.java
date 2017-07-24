package com.thedeathstar.repository;

import com.thedeathstar.model.Ship;

import java.util.List;

/**
 * Created by Jeremy on 7/23/17.
 */
public interface ShipRepository {

     public List<Ship> GetShips();
     public Ship GetShip(int id);

}
