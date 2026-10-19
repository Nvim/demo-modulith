package org.formation.demomodulithsb4.catalog.internal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
public class CoffeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    @Getter
    private String name;
    private int price;

    protected CoffeeEntity() {

    }

    public CoffeeEntity(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
