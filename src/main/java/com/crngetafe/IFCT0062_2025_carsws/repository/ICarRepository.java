package com.crngetafe.IFCT0062_2025_carsws.repository;

import com.crngetafe.IFCT0062_2025_carsws.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ICarRepository extends JpaRepository<Car, Integer> {
}
