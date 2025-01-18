package com.example.warehouse.repository;

import com.example.warehouse.model.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Integer> {
}
