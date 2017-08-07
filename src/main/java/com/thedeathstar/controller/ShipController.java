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
    public ResponseEntity<String> GetShips(){

       return new ResponseEntity<String>("deathstar2", HttpStatus.OK);

    }
}

