package org.extinctbirds.api.controller;

import org.extinctbirds.api.entity.Bird;
import org.extinctbirds.api.entity.Category;
import org.extinctbirds.api.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> getCategories() {
        return new ResponseEntity<>(categoryService.getCategories(), HttpStatus.OK);
    }

    @GetMapping(
            params = "name"
    )
    public ResponseEntity<Category> getCategoryByName(@RequestParam String name) {
        return new ResponseEntity<>(categoryService.findByName(name), HttpStatus.OK);
    }

}
