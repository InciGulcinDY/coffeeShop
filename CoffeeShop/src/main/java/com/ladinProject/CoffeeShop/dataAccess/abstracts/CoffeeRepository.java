package com.ladinProject.CoffeeShop.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ladinProject.CoffeeShop.entities.concretes.Coffee;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Integer>{

}
