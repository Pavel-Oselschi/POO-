package com.example.warehouse.repository;

import com.example.warehouse.model.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory, Integer> {
}
