package org.formation.demomodulithsb4.catalog;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("coffees")
public class CatalogController {
    private final Catalog catalog;

    CatalogController(Catalog catalog) {
        this.catalog = catalog;
    }

    @PostMapping
    Long create(@RequestParam String name, @RequestParam int price) {
        return catalog.createCoffee(name, price);
    }
}
