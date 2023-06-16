package org.extinctbirds.api.controller;

import org.extinctbirds.api.entity.Bird;
import org.extinctbirds.api.service.impl.BirdServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bird")
@CrossOrigin(origins = "*")
public class BirdController {

    @Autowired
    private BirdServiceImpl birdService;

    @GetMapping
    public ResponseEntity<List<Bird>> getBirds() {
        return new ResponseEntity<>(birdService.getBirds(), HttpStatus.OK);
    }

    @GetMapping(
            params = "nameCategory"
    )
    public ResponseEntity<List<Bird>> getBirdsByCategory(@RequestParam String nameCategory) {
        return new ResponseEntity<>(birdService.getBirdsByCategory(nameCategory), HttpStatus.OK);
    }

    @GetMapping(
            params = "nameBird"
    )
    public ResponseEntity<Bird> getBirdById(@RequestParam String nameBird) {
        return new ResponseEntity<>(birdService.getBirdById(nameBird), HttpStatus.OK);
    }

}
