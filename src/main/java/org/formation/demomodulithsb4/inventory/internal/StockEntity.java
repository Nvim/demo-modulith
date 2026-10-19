package org.formation.demomodulithsb4.inventory.internal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class StockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;
    private Long coffeeId;
    private int quantity;

    protected StockEntity() {}

    protected StockEntity(Long coffeeId, int quantity) {
       this.coffeeId = coffeeId; this.quantity = quantity;
    }
}
