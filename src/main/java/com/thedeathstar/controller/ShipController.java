package com.thedeathstar.controller;

import com.thedeathstar.model.Ship;
import com.thedeathstar.repository.ShipRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Jeremy on 7/23/17.
 */
@RestController
public class ShipController {

public ShipController(ShipRepository _shipRepository){

    shipRepository = _shipRepository;
}

private ShipRepository shipRepository;

    @RequestMapping(value = "/ships", method = RequestMethod.GET)
    public ResponseEntity<List<Ship>> GetShips() {

        List<Ship> ships = shipRepository.GetShips();

       return new ResponseEntity<List<Ship>>(ships, HttpStatus.OK);

    }

    @RequestMapping(value = "/ships/{id}", method = RequestMethod.GET)
    public ResponseEntity<Ship> GetShip(  @PathVariable("id") int id) {

        return new ResponseEntity<Ship>(shipRepository.GetShip(id), HttpStatus.OK);

    }


}

