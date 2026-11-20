package com.example.servicevoiture.repositories;

import com.example.servicevoiture.entitites.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
