package com.sunny.Dishes.repository;

import com.sunny.Dishes.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish, Integer> {

//    DishEntity findById(long dishId);


}
