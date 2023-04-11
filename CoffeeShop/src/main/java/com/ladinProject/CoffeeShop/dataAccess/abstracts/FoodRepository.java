package com.ladinProject.CoffeeShop.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ladinProject.CoffeeShop.entities.abstracts.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer>{

}
